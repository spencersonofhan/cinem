public class Media
{
    private String Mname;
    private int Mrank;
    private String Mcreator;
    private String Mtype;
    private String MreleaseDate;
    private boolean Mcompleted;

    public Media(String name, int rank)
    {
        Mname = name;
        Mrank = rank;
        Mcreator = "";
        Mtype = "";
        MreleaseDate = "";
        Mcompleted = false;
    }

    public String getName() { return Mname; }
    public int getRank() { return Mrank; }
}
