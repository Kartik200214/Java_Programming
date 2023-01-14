/*
    Output :
            A
            BC
            DEF
            GHIJ 
*/
public class CharacterPattern {
    public static void main(String args[])
    {
        char ch ='A';
        for(int line = 1; line <= 4; line++)
        {
            for(int charec=1; charec <= line;charec++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
