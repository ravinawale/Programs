package code.designpattern;

//Facade is a structural design pattern that provides a simplified interface to a library,
//A framework, or any other complex set of classes.
public class Facade {
	
	FatcaHelper helper = new FatcaHelperImpl();
	
	public Factca getFatacImpl(String region) {
		if(region.equals("UK")) {
			return helper.getUKFatca();
		}else if (region.equals("US")) {
			return helper.getUSFatca();
		}else {
			return helper.getGlobalFatca();
		}
	}
}

class FatcaHelperImpl implements FatcaHelper{
	@Override
	public FatcaUK getUKFatca() {
		return null;
	}

	@Override
	public FatcaUS getUSFatca() {
		return null;
	}

	@Override
	public FatcaGlobal getGlobalFatca() {
		return null;
	}
}

interface FatcaHelper{
	public FatcaUK getUKFatca();
	public FatcaUS getUSFatca();
	public FatcaGlobal getGlobalFatca();
}

interface Factca {
}

class FatcaUK implements Factca {
}

class FatcaUS implements Factca {
}

class FatcaGlobal implements Factca {
}

