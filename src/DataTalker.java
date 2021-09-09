import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DataTalker
{

    private ArrayList<Media> movies = new ArrayList<>();
    private Random random = new Random();

    public DataTalker()
    {
        movies.add(new Media("Shark 2", 9));
        movies.add(new Media("Fish Tale", 3));
        movies.add(new Media("Shrek infinite", 19));
        movies.add(new Media("Zomboy", 14));
        movies.add(new Media("Nono", 5));
        movies.add(new Media("Shark 3", 14));
        movies.add(new Media("Shunned", 8));
    }

    // Normal pick from user specified list
    public Media pick()
    {
        Collections.shuffle(movies);

        int sum = 0;
        for (Media m : movies)
        {
            sum += m.getRank();
        }

        Media current;
        int rand = random.nextInt(sum - 1) + 1;

        for (int i = 0; i < movies.size(); ++i)
        {
            current = movies.get(i);
            if (current.getRank() >= rand)
            {
                return current;
            }
            else
            {
                rand -= current.getRank();
            }
        }
        return new Media("", 0);
    }
}
