package com.company2;
public class Book {
    private int m_pages;
    private String m_author;
    private String m_name;
    private int m_year;
    public Book(int pages,String author,String name, int year) {
        m_author = author;
        m_name = name;
        m_pages = pages;
        m_year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "m_pages=" + m_pages +
                ", m_author='" + m_author + '\'' +
                ", m_name='" + m_name + '\'' +
                ", m_year=" + m_year +
                '}';
    }

    public void setM_author(String m_author) {
        this.m_author = m_author;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setM_pages(int m_pages) {
        this.m_pages = m_pages;
    }

    public void setM_year(int m_year) {
        this.m_year = m_year;
    }

    public int getM_pages() {
        return m_pages;
    }

    public int getM_year() {
        return m_year;
    }

    public String getM_author() {
        return m_author;
    }

    public String getM_name() {
        return m_name;
    }
}