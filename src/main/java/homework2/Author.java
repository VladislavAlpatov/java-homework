package homework2;

public class Author
{
    public String GetsName()
    {
        return m_sName;
    }

    public String getsEmail()
    {
        return m_sEmail;
    }

    public char getChrGender()
    {
        return m_chrGender;
    }

    private String m_sName;
    private String m_sEmail;
    private char   m_chrGender;


    public Author(String sName, String sEmail, char chrGender)
    {
        m_sName = sName;
        m_sEmail = sEmail;
        m_chrGender = chrGender;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%c) at %s", m_sName, m_chrGender, m_sEmail);
    }
}
