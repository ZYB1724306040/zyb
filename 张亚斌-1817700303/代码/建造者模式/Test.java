public class Test {

    public static void main(String[] args) {
        ChickenSoup essay1 = new EssayDirector().getFinalEssay(new CookingIsEasy());
        essay1.showChickenSoup();
        
        ChickenSoup essay2 = new EssayDirector().getFinalEssay(new CodingIsNotDiffcult());
        essay2.showChickenSoup();
        
    }

}