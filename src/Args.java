public class Args
{
    private String[] args;

    public Args(String[] cmdArgs)
    {
        args = cmdArgs;

        boolean flagFirst = false;
        for (int i = 0; i < cmdArgs.length; ++i)
        {
            switch(args[i].toLowerCase())
            {
                // Actor search
                case "-a":
                // Edit list
                case "-e":
                // Genre search
                case "-g":
                // Help
                case "-h":
                    System.out.println("Cinem is a program that picks a movie for you based on a user made list!\n");
                    System.out.println("---FLAGS---");
                    System.out.println("-a <name>: Search for movies with specific people by specifying");
                    System.out.println("-e: A window pops up that allows creation and modification of the movie list");
                    System.out.println("-g <name>: Search for movies within a specified genre");
                    System.out.println("-h: help");
                    System.out.println("-l <minutes>-<minutes>: Search for movies within the specified length (in minutes)");
                    System.out.println("-r: Picks randomly from all movies");
                    System.out.println("-t: Pulls up a window for the creation of a temporary movie list");
                // Length search
                case "-l":
                // Random search
                case "-r":
                // Temporary list
                case "-t":

                default:
                    System.out.println("OH DEAR LORD NO!");
            }
        }

    }

    public String[] getArgs() { return args; }
    public int getArgCount() { return args.length; }
}
