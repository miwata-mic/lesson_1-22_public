package jp.co.micsolutions.lesson_1_22.data;
import java.nio.file.Path;
import java.util.List;

public interface DataOutput {

	public void outputInfo(Store store);

    public void registerData(Store store, List<Store> storeList, Path path);
}