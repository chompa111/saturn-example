import graphical.basics.presentation.Presentation;
import graphical.basics.presentation.PresentationConfig;

public class Ex extends Presentation {
    @Override
    public void setup(PresentationConfig presentationConfig) {
        presentationConfig.setDisableCodec(true);
    }

    @Override
    protected void buildPresentation() {

    }

    public static void main(String[] args) {
        new Ex().build();
    }
}
