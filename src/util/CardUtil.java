package util;

import entity.HandCard;

public class CardUtil {

	static public class bullet extends HandCard {

		public bullet() {
			super(ImageUtil.getImage("img/card/bullet.png"));
		}

		@Override
		public void setInfo() {
			this.info = "这是一颗危险的子弹\n" + "可对一名角色造成一点伤害";
		}

		@Override
		public void work() {

		}
	}

}
