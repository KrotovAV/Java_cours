package sixth_lesson.sixth_HW;

import java.util.ArrayList;
import java.util.Scanner;

public class progFind {
    public static void main(String[] args) {
    Infrastructure infrastructure = new Infrastructure();

    // System.out.println(infrastructure.getAllInfo(1));
    // System.out.println(infrastructure.getAllInfo(2));
    // System.out.println(infrastructure.getAllInfo(3));
    // System.out.println(infrastructure.getAllInfo(4));

    infrastructure.searchCinema();
    }
}

class Infrastructure {
    public Infrastructure() {
    init();
    }

    Db db;

    public Db getDb() {
    return db;
    }

    public String getAllInfo(int idCinema) {
        Cinema c = db.films.get(idCinema - 1);
        // int id, String name, String director, int genre, int filmProd, int country, int year)
        return String.format("%d %s %s %s %s %s %s",
            c.id,
            c.name,
            db.dir.get(c.director - 1).dirName,
            db.genres.get(c.genre - 1).name,
            db.prod.get(c.filmProd - 1).titleName,
            db.filmCountry.get(c.country - 1).name,
            db.filmYear.get(c.year - 1).year);
    }

    Db init() {
    db = new Db();
    // int id, String name, String director, int genre, int filmProd, int country, int year)
    Cinema c1 = new Cinema(1, "Тьма", 1, 1, 1, 1, 1);
    Cinema c2 = new Cinema(2, "Свет", 1, 2, 3, 1, 2);
    Cinema c3 = new Cinema(3, "Особенности национальной ...", 3, 3, 2, 3, 3);
    Cinema c4 = new Cinema(4, "Чеовек паук", 3, 3, 1, 4, 4);

    FilmDirectorFactory fd = new FilmDirectorFactory();
    db.addFilmDirector(fd.getFilmDirector("Петров В.Н."));
    db.addFilmDirector(fd.getFilmDirector("Gtound K."));
    db.addFilmDirector(fd.getFilmDirector("Deby Dc"));

    db.filmCountry.add(new FilmCountry(1, "US"));
    db.filmCountry.add(new FilmCountry(2, "GB"));
    db.filmCountry.add(new FilmCountry(3, "RU"));
    db.filmCountry.add(new FilmCountry(4, "BY"));

    db.filmYear.add(new FilmYear(1, "1995"));
    db.filmYear.add(new FilmYear(2, "1998"));
    db.filmYear.add(new FilmYear(3, "2002"));
    db.filmYear.add(new FilmYear(4, "2005"));

    db.films.add(c1);
    db.films.add(c2);
    db.films.add(c3);
    db.films.add(c4);

    db.genres.add(new Genre(1, "Ужасы"));
    db.genres.add(new Genre(2, "Драмма"));
    db.genres.add(new Genre(3, "Комедия"));

    FilmProducerFactory pf = new FilmProducerFactory();

    db.addFilmProducer(pf.getFilmProducer("Ленфильм"));
    db.addFilmProducer(pf.getFilmProducer("Марвел"));
    db.addFilmProducer(pf.getFilmProducer("Мосфильм"));
    db.addFilmProducer(pf.getFilmProducer("DC"));

    return db;
    }

//-------------------------------------
    public void searchCinema() {
        boolean check = true;
        Input scanner = new Input();
        String text1 = "", text2 = "";
        while(check){
            text1 = scanner.inputString("To find film:\n - by name - 'n', - by genre - 'g', - by year - 'y', - by director - 'd', - by fectory - 'f',  - to exit - 'e'");
            if(text1.equals("e")) check = false;
            else {
                ArrayList<Cinema> movies = new ArrayList<>();
                if (text1.equals("n")) { 
                    text2 = scanner.inputString("Write name"); 
                    for (Cinema cinema : db.films) {
                        if (cinema.name.toLowerCase().indexOf(text2.toLowerCase()) != -1){
                            movies.add(cinema);
                        }
                    }
                }
                if (text1.equals("g")) { 
                    text2 = scanner.inputString("Write ganre");
                    for (Cinema cinema : db.films) {
                        if (db.genres.get(cinema.genre - 1).name.toLowerCase().indexOf(text2.toLowerCase()) != -1){
                            movies.add(cinema);
                        }
                    }
                } 
                if (text1.equals("y")) { 
                    text2 = scanner.inputString("Write year");
                    for (Cinema cinema : db.films) {
                        if (db.filmYear.get(cinema.year - 1).year.toLowerCase().indexOf(text2.toLowerCase()) != -1){
                            movies.add(cinema);
                        }
                    }
                }
                if (text1.equals("d")) { 
                    text2 = scanner.inputString("Write director");
                    for (Cinema cinema : db.films) {
                        if (db.dir.get(cinema.director - 1).dirName.toLowerCase().indexOf(text2.toLowerCase()) != -1){
                            movies.add(cinema);
                        }
                    }
                }
                if (text1.equals("f")) { 
                    text2 = scanner.inputString("Write fectory");
                    for (Cinema cinema : db.films) {
                        if (db.prod.get(cinema.filmProd  - 1).titleName.toLowerCase().indexOf(text2.toLowerCase()) != -1){
                            movies.add(cinema);
                        }
                    }
                }

                if (movies.size() == 0) System.out.println("Nofing found");
                else{
                    System.out.println("Found the following: ");
                    for (Cinema cinema : movies) {
                        System.out.println(getAllInfo(cinema.id));
                    }
                }
                System.out.println();
            }
        }
    }
}
//---------------------------------------------------------

class Input {
    Scanner iScanner;

    public String inputString(String text)
    {
        while (true) {
            System.out.println(text);
            iScanner = new Scanner(System.in, "Cp866");
            try
            {
                String result = iScanner.next();
                return result;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void scanerClose(){
        iScanner.close();
    }
}

class Db {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<FilmDirector> dir = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();
    ArrayList<FilmProducer> prod = new ArrayList<>();
    ArrayList<FilmCountry> filmCountry = new ArrayList<>();
    ArrayList<FilmYear> filmYear = new ArrayList<>();

    public void addFilmDirector(FilmDirector director) {
        dir.add(director);
    }

    public void addFilmProducer(FilmProducer producer) {
        prod.add(producer);
    }
}

class Cinema {
    int id;
    String name;
    int director;
    int genre;
    int filmProd;
    int country;
    int year;

    public Cinema(int id, String name, int director, int genre, int filmProd, int country, int year) {
    this.id = id;
    this.name = name;
    this.director = director;
    this.genre = genre;
    this.filmProd = filmProd;
    this.country = country;
    this.year = year;
    }
}

class FilmProducer {
    int id;
    String titleName;
}

class FilmDirector {
    int id;
    String dirName;
}
class FilmDirectorFactory {
    int count = 1;

    public FilmDirector getFilmDirector(String name) {
        FilmDirector fd = new FilmDirector();
        fd.id = count++;
        fd.dirName = name;
        return fd;
    }
}

class Genre {
    int id;
    String name;

    public Genre(int id, String name) {
    this.id = id;
    this.name = name;
    }
}

class FilmCountry {
    int id;
    String name;

    public FilmCountry (int id, String name) {
    this.id = id;
    this.name = name;
    }
}

class FilmProducerFactory {
    int count = 1;

    public FilmProducer getFilmProducer(String name) {
    FilmProducer fp = new FilmProducer();
    fp.id = count++;
    fp.titleName = name;
    return fp;
    }
}

class FilmYear {
    int id;
    String year;

    public FilmYear(int id, String year) {
    this.id = id;
    this.year = year;
    }
}

