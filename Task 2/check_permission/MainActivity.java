package com.example.check_permission;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import java.util.List;
import android.content.Intent;
import android.provider.Settings;
import android.net.Uri;
import android.Manifest.permission_group;
import java.lang.String;
import android.os.Bundle;
import android.content.pm.PackageManager.*;


public class MainActivity extends AppCompatActivity {

    Button btnShowApps;
    ListView listViewApps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewApps = findViewById(R.id.listViewApps);
    }
    public void buttonGetAppsPermission(View view) {
        List<ApplicationInfo> listApplicationInfo = getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA);
        String[] stringsList = new String[listApplicationInfo.size()];
        int i=0;
        for (ApplicationInfo ApplicationInfo: listApplicationInfo) {
            stringsList[i] = ApplicationInfo.packageName;
            i++;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, stringsList);
        listViewApps.setAdapter(adapter);


   listViewApps.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
    }
    });
    }
}