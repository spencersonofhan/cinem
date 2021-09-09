public class Cinem
{
    public static void main(String[] args)
    {
        Args arg = new Args(args);
        DataTalker dt = new DataTalker();

        for (int j = 0; j < 100; ++j)
        {
            System.out.println((dt.pick()).getName());
        }
    }
}
