package searchingandsorting;

public class SearchingAndSorting
{
    int[] cards = {3, 5, 4, 7 ,1};
    
    public void searchCard(int theCard)
    {
        System.out.println("SEARCH CARD METHOD IS RUNNING");
        for(int i=0;i<cards.length;i++)
        {
            if(cards[i] == theCard)
            {
                System.out.println(theCard+" has been found at the location "+i+" in the array.");
            }
        }
    }
    
    public void sortCards()
    {
        System.out.println("SORT CARD METHOD IS RUNNING");
        
        for(int i=0;i<cards.length;i++)
        {
            for(int k=0;k<cards.length-1;k++)
            {
                if(cards[k]> cards[k+1])
                {
                    int tempCard = cards[k];
                    cards[k] = cards[k+1];
                    cards[k+1] = tempCard;
                }
            }
        }
    }
    
    public void outputCards()
    {
        System.out.println("OUTPUT CARD METHOD IS RUNNING");
        
        for(int i=0;i<cards.length;i++)
        {
            System.out.println(cards[i]);
        }
    }
    
    public static void main(String[] args)
    {
        SearchingAndSorting sas = new SearchingAndSorting();
        sas.searchCard(4);
        sas.sortCards();
        sas.outputCards();
    }

}
