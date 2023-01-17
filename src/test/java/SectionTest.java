import org.junit.jupiter.api.Test;
import sp.models.Element;
import sp.models.Image;
import sp.models.Paragraph;
import sp.models.Section;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SectionTest {

    @Test
    public void givenSection_whenChildrenHasNoParent_thenAddChild(){

        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        assertTrue(child == section.get(0));
    }

    @Test
    public void givenSection_whenChildHasParent_thenThrowException(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        Section section1 = new Section("");


        assertThrows(UnsupportedOperationException.class, () -> section1.add(child));
    }
    @Test
    public void givenSection_whenChildAndParentAreTheSame_thenThrowException(){
        Section section = new Section("test");

        assertThrows(UnsupportedOperationException.class, () -> section.add(section));}


        @Test
        public void givenSection_whenChildAndParentAreTheSameAndDifferentSection_thenThrowException(){
            Section section = new Section("test");
            Element child = new Image("");

            section.add(child);

            Section section1 = new Section("");
            assertThrows(UnsupportedOperationException.class, () -> section1.add(child));
        }


    @Test
    public void givenLeaf_whenCallAggregateMethod_thenThrowException(){
        Element e = new Image("test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get((0)));
    }

    @Test
    public void givenParagraph_whenCallAggregateMethod_thenThrowException(){
        Element e = new Paragraph("test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get((0)));
    }

}
