package homework2;

public class Book
{
    private String m_Name;
    private String m_AuthorName;
    private int m_iPagesCount = 0;

    public Book(String name, String author)
    {
        m_Name = name;
        m_AuthorName = author;
    }
    public String GetAuthorName()
    {
        return m_AuthorName;
    }

    public String GetName()
    {
        return m_Name;
    }

    public void SetName(String name)
    {
        m_Name = name;
    }

    public void SetAuthorName(String authorName)
    {
        m_AuthorName = authorName;
    }

    public int GetPagesCount()
    {
        return m_iPagesCount;
    }
    public void SetPagesCount(int iPagesCount)
    {
        m_iPagesCount = iPagesCount;
    }
    @Override
    public String toString()
    {
        return "Book @ ("+m_Name+", "+m_AuthorName+", "+Integer.toString(m_iPagesCount) + ").";
    }
}
