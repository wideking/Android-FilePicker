package droidninja.filepicker;

import android.app.Application;

import droidninja.filepicker.utils.image.FrescoManager;

/**
 * Created by widek on 19.2.2017..
 */

public class FilePickerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FrescoManager.init(this);
    }
}
