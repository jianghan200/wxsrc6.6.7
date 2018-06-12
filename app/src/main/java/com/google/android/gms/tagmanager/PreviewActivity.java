package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class PreviewActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      m.re();
      paramBundle = getIntent().getData();
      if (!d.av(this).f(paramBundle))
      {
        paramBundle = "Cannot preview the app with the uri: " + paramBundle + ". Launching current version instead.";
        m.rd();
        AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
        localAlertDialog.setTitle("Preview failure");
        localAlertDialog.setMessage(paramBundle);
        localAlertDialog.setButton(-1, "Continue", new PreviewActivity.1(this));
        localAlertDialog.show();
      }
      paramBundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (paramBundle != null)
      {
        new StringBuilder("Invoke the launch activity for package name: ").append(getPackageName());
        m.re();
        startActivity(paramBundle);
        return;
      }
      new StringBuilder("No launch activity found for package name: ").append(getPackageName());
      m.re();
      return;
    }
    catch (Exception paramBundle)
    {
      new StringBuilder("Calling preview threw an exception: ").append(paramBundle.getMessage());
      m.rb();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/tagmanager/PreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */