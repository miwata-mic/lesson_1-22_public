package jp.co.micsolutions.lesson_1_22.data;
import java.nio.file.Path;
import java.util.List;

public interface DataInput {

    public List<Store> getInputData(Path path);

	public Store getStoreData(int key, List<Store> storeList);
}