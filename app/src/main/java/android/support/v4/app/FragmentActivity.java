package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.media.session.MediaController;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.e.j;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FragmentActivity
  extends h
  implements a.a, c.a
{
  static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
  static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
  static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
  private static final String TAG = "FragmentActivity";
  boolean mCreated;
  final k mFragments = new k(new a());
  final Handler mHandler = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        super.handleMessage(paramAnonymousMessage);
      case 1: 
        do
        {
          return;
        } while (!FragmentActivity.this.mStopped);
        FragmentActivity.this.doReallyStop(false);
        return;
      }
      FragmentActivity.this.onResumeFragments();
      FragmentActivity.this.mFragments.execPendingActions();
    }
  };
  android.support.v4.media.session.a mMediaController;
  int mNextCandidateRequestIndex;
  boolean mOptionsMenuInvalidated;
  android.support.v4.e.k<String> mPendingFragmentActivityResults;
  boolean mReallyStopped;
  boolean mRequestedPermissionsFromFragment;
  boolean mResumed;
  boolean mRetaining;
  boolean mStartedActivityFromFragment;
  boolean mStopped;
  
  private int allocateRequestIndex(Fragment paramFragment)
  {
    if (this.mPendingFragmentActivityResults.size() >= 65534) {
      throw new IllegalStateException("Too many pending Fragment activity results.");
    }
    while (this.mPendingFragmentActivityResults.indexOfKey(this.mNextCandidateRequestIndex) >= 0) {
      this.mNextCandidateRequestIndex = ((this.mNextCandidateRequestIndex + 1) % 65534);
    }
    int i = this.mNextCandidateRequestIndex;
    this.mPendingFragmentActivityResults.put(i, paramFragment.mWho);
    this.mNextCandidateRequestIndex = ((this.mNextCandidateRequestIndex + 1) % 65534);
    return i;
  }
  
  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(viewToString(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        if (j > 0)
        {
          paramString = paramString + "  ";
          int i = 0;
          while (i < j)
          {
            dumpViewHierarchy(paramString, paramPrintWriter, paramView.getChildAt(i));
            i += 1;
          }
        }
      }
    }
  }
  
  private void requestPermissionsFromFragment(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    if (paramInt == -1)
    {
      a.a(this, paramArrayOfString, paramInt);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    try
    {
      this.mRequestedPermissionsFromFragment = true;
      a.a(this, paramArrayOfString, (allocateRequestIndex(paramFragment) + 1 << 16) + (0xFFFF & paramInt));
      return;
    }
    finally
    {
      this.mRequestedPermissionsFromFragment = false;
    }
  }
  
  private static String viewToString(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int i;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label570;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label576;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label582;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label588;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label594;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label600;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label606;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label612;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localObject = paramView.getResources();
          if ((i != 0) && (localObject != null)) {
            switch (0xFF000000 & i)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        String str = ((Resources)localObject).getResourceTypeName(i);
        localObject = ((Resources)localObject).getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label570:
        label576:
        label582:
        label588:
        label594:
        label600:
        label606:
        label612:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.mFragments.mHost.mFragmentManager.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void doReallyStop(boolean paramBoolean)
  {
    if (!this.mReallyStopped)
    {
      this.mReallyStopped = true;
      this.mRetaining = paramBoolean;
      this.mHandler.removeMessages(1);
      onReallyStop();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = Build.VERSION.SDK_INT;
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.mCreated);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.mReallyStopped);
    l locall = this.mFragments.mHost;
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(locall.mLoadersStarted);
    if (locall.mLoaderManager != null)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(locall.mLoaderManager)));
      paramPrintWriter.println(":");
      locall.mLoaderManager.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.mHost.mFragmentManager.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    dumpViewHierarchy(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    b localb = (b)getLastNonConfigurationInstance();
    if (localb != null) {
      return localb.nA;
    }
    return null;
  }
  
  public m getSupportFragmentManager()
  {
    return this.mFragments.mHost.mFragmentManager;
  }
  
  public t getSupportLoaderManager()
  {
    l locall = this.mFragments.mHost;
    if (locall.mLoaderManager != null) {
      return locall.mLoaderManager;
    }
    locall.mCheckedForLoaderManager = true;
    locall.mLoaderManager = locall.b("(root)", locall.mLoadersStarted, true);
    return locall.mLoaderManager;
  }
  
  public final android.support.v4.media.session.a getSupportMediaController()
  {
    return this.mMediaController;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mFragments.noteStateNotSaved();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      i -= 1;
      Object localObject = (String)this.mPendingFragmentActivityResults.get(i);
      this.mPendingFragmentActivityResults.remove(i);
      if (localObject == null) {}
      do
      {
        return;
        localObject = this.mFragments.findFragmentByWho((String)localObject);
      } while (localObject == null);
      ((Fragment)localObject).onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onBackPressed()
  {
    if (!this.mFragments.mHost.mFragmentManager.popBackStackImmediate()) {
      onBackPressedNotHandled();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.mHost.mFragmentManager.dispatchConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = this.mFragments;
    ((k)localObject1).mHost.mFragmentManager.a(((k)localObject1).mHost, ((k)localObject1).mHost, null);
    super.onCreate(paramBundle);
    localObject1 = (b)getLastNonConfigurationInstance();
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = this.mFragments;
      localObject3 = ((b)localObject1).nC;
      ((k)localObject2).mHost.nE = ((j)localObject3);
    }
    if (paramBundle != null)
    {
      localObject2 = paramBundle.getParcelable("android:support:fragments");
      localObject3 = this.mFragments;
      if (localObject1 == null) {
        break label189;
      }
      localObject1 = ((b)localObject1).nB;
      ((k)localObject3).mHost.mFragmentManager.restoreAllState((Parcelable)localObject2, (List)localObject1);
      if (paramBundle.containsKey("android:support:next_request_index"))
      {
        this.mNextCandidateRequestIndex = paramBundle.getInt("android:support:next_request_index");
        localObject1 = paramBundle.getIntArray("android:support:request_indicies");
        paramBundle = paramBundle.getStringArray("android:support:request_fragment_who");
        if ((localObject1 != null) && (paramBundle != null) && (localObject1.length == paramBundle.length)) {
          break label194;
        }
      }
    }
    for (;;)
    {
      if (this.mPendingFragmentActivityResults == null)
      {
        this.mPendingFragmentActivityResults = new android.support.v4.e.k();
        this.mNextCandidateRequestIndex = 0;
      }
      this.mFragments.mHost.mFragmentManager.dispatchCreate();
      return;
      label189:
      localObject1 = null;
      break;
      label194:
      this.mPendingFragmentActivityResults = new android.support.v4.e.k(localObject1.length);
      int i = 0;
      while (i < localObject1.length)
      {
        this.mPendingFragmentActivityResults.put(localObject1[i], paramBundle[i]);
        i += 1;
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      k localk = this.mFragments;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = localk.mHost.mFragmentManager.dispatchCreateOptionsMenu(paramMenu, localMenuInflater);
      if (Build.VERSION.SDK_INT >= 11) {
        return bool1 | bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.mHost.mFragmentManager.dispatchDestroy();
    l locall = this.mFragments.mHost;
    if (locall.mLoaderManager != null) {
      locall.mLoaderManager.bw();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.mHost.mFragmentManager.dispatchLowMemory();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.mFragments.mHost.mFragmentManager.dispatchOptionsItemSelected(paramMenuItem);
    }
    return this.mFragments.mHost.mFragmentManager.dispatchContextItemSelected(paramMenuItem);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.mFragments.noteStateNotSaved();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.mFragments.mHost.mFragmentManager.dispatchOptionsMenuClosed(paramMenu);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.mResumed = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      onResumeFragments();
    }
    this.mFragments.mHost.mFragmentManager.T(4);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.execPendingActions();
  }
  
  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.mOptionsMenuInvalidated)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return onPrepareOptionsPanel(paramView, paramMenu) | this.mFragments.mHost.mFragmentManager.dispatchPrepareOptionsMenu(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  void onReallyStop()
  {
    Object localObject = this.mFragments;
    boolean bool = this.mRetaining;
    localObject = ((k)localObject).mHost;
    ((l)localObject).nF = bool;
    if ((((l)localObject).mLoaderManager != null) && (((l)localObject).mLoadersStarted))
    {
      ((l)localObject).mLoadersStarted = false;
      if (!bool) {
        break label65;
      }
      ((l)localObject).mLoaderManager.bt();
    }
    for (;;)
    {
      this.mFragments.mHost.mFragmentManager.T(2);
      return;
      label65:
      ((l)localObject).mLoaderManager.bs();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = paramInt >> 16 & 0xFFFF;
    Object localObject;
    if (i != 0)
    {
      i -= 1;
      localObject = (String)this.mPendingFragmentActivityResults.get(i);
      this.mPendingFragmentActivityResults.remove(i);
      if (localObject != null) {
        break label49;
      }
    }
    label49:
    do
    {
      return;
      localObject = this.mFragments.findFragmentByWho((String)localObject);
    } while (localObject == null);
    ((Fragment)localObject).onRequestPermissionsResult(paramInt & 0xFFFF, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.execPendingActions();
  }
  
  protected void onResumeFragments()
  {
    this.mFragments.mHost.mFragmentManager.dispatchResume();
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.mStopped) {
      doReallyStop(true);
    }
    Object localObject4 = onRetainCustomNonConfigurationInstance();
    n localn = this.mFragments.mHost.mFragmentManager;
    Object localObject2;
    if (localn.nK != null)
    {
      int i = 0;
      localObject1 = null;
      localObject2 = localObject1;
      if (i < localn.nK.size())
      {
        Fragment localFragment = (Fragment)localn.nK.get(i);
        localObject3 = localObject1;
        if (localFragment != null)
        {
          localObject3 = localObject1;
          if (localFragment.mRetainInstance)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localFragment);
            localFragment.mRetaining = true;
            if (localFragment.mTarget == null) {
              break label183;
            }
          }
        }
        label183:
        for (int j = localFragment.mTarget.mIndex;; j = -1)
        {
          localFragment.mTargetIndex = j;
          localObject3 = localObject2;
          if (n.DEBUG)
          {
            new StringBuilder("retainNonConfig: keeping retained ").append(localFragment);
            localObject3 = localObject2;
          }
          i += 1;
          localObject1 = localObject3;
          break;
        }
      }
    }
    else
    {
      localObject2 = null;
    }
    Object localObject1 = this.mFragments.mHost.bj();
    if ((localObject2 == null) && (localObject1 == null) && (localObject4 == null)) {
      return null;
    }
    Object localObject3 = new b();
    ((b)localObject3).nA = localObject4;
    ((b)localObject3).nB = ((List)localObject2);
    ((b)localObject3).nC = ((j)localObject1);
    return localObject3;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.mFragments.mHost.mFragmentManager.saveAllState();
    if (localObject != null) {
      paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
    }
    if (this.mPendingFragmentActivityResults.size() > 0)
    {
      paramBundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
      localObject = new int[this.mPendingFragmentActivityResults.size()];
      String[] arrayOfString = new String[this.mPendingFragmentActivityResults.size()];
      int i = 0;
      while (i < this.mPendingFragmentActivityResults.size())
      {
        localObject[i] = this.mPendingFragmentActivityResults.keyAt(i);
        arrayOfString[i] = ((String)this.mPendingFragmentActivityResults.valueAt(i));
        i += 1;
      }
      paramBundle.putIntArray("android:support:request_indicies", (int[])localObject);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    this.mHandler.removeMessages(1);
    if (!this.mCreated)
    {
      this.mCreated = true;
      this.mFragments.mHost.mFragmentManager.dispatchActivityCreated();
    }
    this.mFragments.noteStateNotSaved();
    this.mFragments.execPendingActions();
    Object localObject = this.mFragments.mHost;
    if (!((l)localObject).mLoadersStarted)
    {
      ((l)localObject).mLoadersStarted = true;
      if (((l)localObject).mLoaderManager == null) {
        break label183;
      }
      ((l)localObject).mLoaderManager.br();
    }
    l locall;
    int k;
    for (;;)
    {
      ((l)localObject).mCheckedForLoaderManager = true;
      this.mFragments.mHost.mFragmentManager.dispatchStart();
      locall = this.mFragments.mHost;
      if (locall.nE == null) {
        return;
      }
      k = locall.nE.size();
      localObject = new u[k];
      i = k - 1;
      while (i >= 0)
      {
        localObject[i] = ((u)locall.nE.valueAt(i));
        i -= 1;
      }
      label183:
      if (!((l)localObject).mCheckedForLoaderManager)
      {
        ((l)localObject).mLoaderManager = ((l)localObject).b("(root)", ((l)localObject).mLoadersStarted, false);
        if ((((l)localObject).mLoaderManager != null) && (!((l)localObject).mLoaderManager.mg)) {
          ((l)localObject).mLoaderManager.br();
        }
      }
    }
    int i = 0;
    while (i < k)
    {
      locall = localObject[i];
      if (locall.mRetaining)
      {
        if (u.DEBUG) {
          new StringBuilder("Finished Retaining in ").append(locall);
        }
        locall.mRetaining = false;
        int j = locall.oX.size() - 1;
        while (j >= 0)
        {
          u.a locala = (u.a)locall.oX.valueAt(j);
          if (locala.mRetaining)
          {
            if (u.DEBUG) {
              new StringBuilder("  Finished Retaining: ").append(locala);
            }
            locala.mRetaining = false;
            if ((locala.mg != locala.pf) && (!locala.mg)) {
              locala.stop();
            }
          }
          if ((locala.mg) && (locala.pd) && (!locala.pg)) {
            locala.c(locala.pc, locala.mData);
          }
          j -= 1;
        }
      }
      locall.bv();
      i += 1;
    }
  }
  
  public void onStateNotSaved()
  {
    this.mFragments.noteStateNotSaved();
  }
  
  public void onStop()
  {
    super.onStop();
    this.mStopped = true;
    this.mHandler.sendEmptyMessage(1);
    this.mFragments.mHost.mFragmentManager.dispatchStop();
  }
  
  public void setEnterSharedElementCallback(al paramal)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      setEnterSharedElementCallback(b.a(a.a(paramal)));
    }
  }
  
  public void setExitSharedElementCallback(al paramal)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      setExitSharedElementCallback(b.a(a.a(paramal)));
    }
  }
  
  public final void setSupportMediaController(android.support.v4.media.session.a parama)
  {
    this.mMediaController = parama;
    if (Build.VERSION.SDK_INT >= 21) {
      setMediaController((MediaController)parama.sB.bM());
    }
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((!this.mStartedActivityFromFragment) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.mStartedActivityFromFragment = true;
    if (paramInt == -1) {}
    try
    {
      a.a(this, paramIntent, -1, paramBundle);
      return;
    }
    finally
    {
      this.mStartedActivityFromFragment = false;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    a.a(this, paramIntent, (allocateRequestIndex(paramFragment) + 1 << 16) + (0xFFFF & paramInt), paramBundle);
    this.mStartedActivityFromFragment = false;
  }
  
  public void supportFinishAfterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      finishAfterTransition();
      return;
    }
    finish();
  }
  
  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.mOptionsMenuInvalidated = true;
  }
  
  public void supportPostponeEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      postponeEnterTransition();
    }
  }
  
  public void supportStartPostponedEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      startPostponedEnterTransition();
    }
  }
  
  public final void validateRequestPermissionsRequestCode(int paramInt)
  {
    if ((!this.mRequestedPermissionsFromFragment) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
  }
  
  final class a
    extends l<FragmentActivity>
  {
    public a()
    {
      super();
    }
    
    public final boolean H(String paramString)
    {
      return a.a(FragmentActivity.this, paramString);
    }
    
    public final void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
    {
      FragmentActivity.this.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
    }
    
    public final void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
    {
      FragmentActivity.this.requestPermissionsFromFragment(paramFragment, paramArrayOfString, paramInt);
    }
    
    public final void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      FragmentActivity.this.dump(paramString, null, paramPrintWriter, paramArrayOfString);
    }
    
    public final boolean bh()
    {
      return !FragmentActivity.this.isFinishing();
    }
    
    public final void bi()
    {
      FragmentActivity.this.supportInvalidateOptionsMenu();
    }
    
    public final void onAttachFragment(Fragment paramFragment)
    {
      FragmentActivity.this.onAttachFragment(paramFragment);
    }
    
    public final View onFindViewById(int paramInt)
    {
      return FragmentActivity.this.findViewById(paramInt);
    }
    
    public final LayoutInflater onGetLayoutInflater()
    {
      return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
    }
    
    public final int onGetWindowAnimations()
    {
      Window localWindow = FragmentActivity.this.getWindow();
      if (localWindow == null) {
        return 0;
      }
      return localWindow.getAttributes().windowAnimations;
    }
    
    public final boolean onHasView()
    {
      Window localWindow = FragmentActivity.this.getWindow();
      return (localWindow != null) && (localWindow.peekDecorView() != null);
    }
    
    public final boolean onHasWindowAnimations()
    {
      return FragmentActivity.this.getWindow() != null;
    }
  }
  
  static final class b
  {
    Object nA;
    List<Fragment> nB;
    j<String, t> nC;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/FragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */