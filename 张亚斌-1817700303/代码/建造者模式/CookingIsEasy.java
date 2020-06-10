public class CookingIsEasy implements EssayBuilder {

    private ChickenSoup chickenSoup = new ChickenSoup();

    @Override
    public void setEssaySubject() {
        chickenSoup.setSubject(new Cook());

    }

    @Override
    public void setEssayPredicate() {
        chickenSoup.setPredicate(new Is());
    }

    @Override
    public void setEssayObject() {
        chickenSoup.setObject(new Easy());

    }

    @Override
    public ChickenSoup getEssay() {
        return chickenSoup;
    }

}

/**
 * 
 * @author Thornhill
 * @see 构造“编程不难”的具体生成器
 */
public class CodingIsNotDiffcult implements EssayBuilder {

    private ChickenSoup chickenSoup = new ChickenSoup();

    @Override
    public void setEssaySubject() {
        chickenSoup.setSubject(new Coding());

    }

    @Override
    public void setEssayPredicate() {
        chickenSoup.setPredicate(new IsNot());

    }

    @Override
    public void setEssayObject() {
        chickenSoup.setObject(new Difficult());

    }

    @Override
    public ChickenSoup getEssay() {
        return chickenSoup;
    }

}