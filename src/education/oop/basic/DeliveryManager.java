package education.oop.basic;

public class DeliveryManager implements Delivery, CargoTracking {

	@Override
	public String track(String queryNO) {

		return "お問い合わせの貨物は倉庫から出荷されました。";
	}

	@Override
	public String deliver(String name, String address, String item) {

		return "187638";
	}

}
