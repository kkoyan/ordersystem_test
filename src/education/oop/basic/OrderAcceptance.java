package education.oop.basic;

//注文受付契約
public interface OrderAcceptance {

	//  商品照会を受けつけて、取扱商品の一覧を返す。
	public String[] queryItems();

	//  注文を受け付けて、受注可否を返す。
	public boolean order(String item);

	//  注文を確定させ、問い合わせ番号を返す。
	public String cofirm (String name, String address);
}
