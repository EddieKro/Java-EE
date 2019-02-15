package ua.com.di.entities;

public class Librarians {
    private User librarian;
    private String name;
    private Integer id;
    private String info;
    private boolean isFree;

    public Librarians(User librarian, String name, Integer id, String info, boolean isFree) {
        this.librarian = librarian;
        this.name = name;
        this.id = id;
        this.info = info;
        this.isFree = isFree;
    }

    public User getLibrarian() {
        return librarian;
    }

    public void setLibrarian(User librarian) {
        this.librarian = librarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    public boolean isFree() {
        return isFree;
    }

    public String toString() {
        return info;
    }
}
