package tmp;//package tmp;
//
//import com.google.common.collect.Lists;
//import io.github.sskorol.core.DataSupplier;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class DataProvider1
//{
//    @DataSupplier(name = "getData")
//    public static Iterator<String> getData()
//    {
//        return Stream.of("a", "b", "c").iterator();
//    }
//
//    @DataSupplier(flatMap = true, runInParallel = true)
//    public static List<List<String>> getData2()
//    {
//        return Lists.newArrayList(Lists.newArrayList("a", "b", "c"),
//            Lists.newArrayList("d", "e", "f"));
//    }
//}
