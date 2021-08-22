package Com.Pages;

import Com.Constants.ArticleConst;
import Com.Driver.Action;

public class Articles {


	public void verifyArticle(String expectedResults) throws InterruptedException {
		Action.ClickonButton(ArticleConst.CRICKET, expectedResults);
		Thread.sleep(2000);
	}
}
