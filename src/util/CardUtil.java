package util;

import entity.HandCard;

public class CardUtil {

	static public class bullet extends HandCard {

		public bullet() {
			super(ImageUtil.getImage("img/card/bullet.png"));
		}

		@Override
		public void setInfo() {
			this.info = "����һ��Σ�յ��ӵ�\n" + "�ɶ�һ����ɫ���һ���˺�";
		}

		@Override
		public void work() {

		}
	}

}
