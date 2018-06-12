package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.e.c;
import android.support.v4.e.d;
import android.support.v4.view.k;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class n
  extends m
  implements k
{
  static boolean DEBUG;
  static final boolean nG;
  static Field nV = null;
  static final Interpolator oe = new DecelerateInterpolator(2.5F);
  static final Interpolator of = new DecelerateInterpolator(1.5F);
  static final Interpolator og = new AccelerateInterpolator(2.5F);
  static final Interpolator oh = new AccelerateInterpolator(1.5F);
  l mHost;
  ArrayList<Runnable> nH;
  Runnable[] nI;
  boolean nJ;
  ArrayList<Fragment> nK;
  ArrayList<Fragment> nL;
  ArrayList<Integer> nM;
  ArrayList<e> nN;
  ArrayList<Fragment> nO;
  ArrayList<e> nP;
  ArrayList<Integer> nQ;
  ArrayList<Object> nR;
  int nS = 0;
  j nT;
  Fragment nU;
  boolean nW;
  boolean nX;
  boolean nY;
  String nZ;
  boolean oa;
  Bundle ob = null;
  SparseArray<Parcelable> oc = null;
  Runnable od = new Runnable()
  {
    public final void run()
    {
      n.this.execPendingActions();
    }
  };
  
  static
  {
    boolean bool = false;
    DEBUG = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    nG = bool;
  }
  
  public static int U(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramFragment.onCreateAnimation(paramInt1, paramBoolean, paramFragment.mNextAnim);
    if (localAnimation != null) {
      paramFragment = localAnimation;
    }
    do
    {
      return paramFragment;
      if (paramFragment.mNextAnim == 0) {
        break;
      }
      localAnimation = AnimationUtils.loadAnimation(this.mHost.mContext, paramFragment.mNextAnim);
      paramFragment = localAnimation;
    } while (localAnimation != null);
    if (paramInt1 == 0) {
      return null;
    }
    int i = -1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = i;
    }
    while (paramInt1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 2;
        continue;
        if (paramBoolean)
        {
          paramInt1 = 3;
        }
        else
        {
          paramInt1 = 4;
          continue;
          if (paramBoolean) {
            paramInt1 = 5;
          } else {
            paramInt1 = 6;
          }
        }
      }
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.mHost.onHasWindowAnimations()) {
          paramInt1 = this.mHost.onGetWindowAnimations();
        }
      }
      if (paramInt1 == 0) {
        return null;
      }
      break;
    case 1: 
      return b(1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return b(1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return b(0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return b(1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return q(0.0F, 1.0F);
    case 6: 
      return q(1.0F, 0.0F);
    }
    return null;
  }
  
  /* Error */
  private void a(int paramInt, e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 168	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 169	java/util/ArrayList:<init>	()V
    //   17: putfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   24: invokevirtual 172	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload 4
    //   31: istore_3
    //   32: iload_1
    //   33: iload 4
    //   35: if_icmpge +45 -> 80
    //   38: getstatic 77	android/support/v4/app/n:DEBUG	Z
    //   41: ifeq +26 -> 67
    //   44: new 174	java/lang/StringBuilder
    //   47: dup
    //   48: ldc -80
    //   50: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   53: iload_1
    //   54: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: ldc -71
    //   59: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: aload_2
    //   63: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_0
    //   68: getfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   71: iload_1
    //   72: aload_2
    //   73: invokevirtual 195	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: iload_3
    //   81: iload_1
    //   82: if_icmpge +49 -> 131
    //   85: aload_0
    //   86: getfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   89: aconst_null
    //   90: invokevirtual 199	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_0
    //   95: getfield 201	android/support/v4/app/n:nQ	Ljava/util/ArrayList;
    //   98: ifnonnull +14 -> 112
    //   101: aload_0
    //   102: new 168	java/util/ArrayList
    //   105: dup
    //   106: invokespecial 169	java/util/ArrayList:<init>	()V
    //   109: putfield 201	android/support/v4/app/n:nQ	Ljava/util/ArrayList;
    //   112: aload_0
    //   113: getfield 201	android/support/v4/app/n:nQ	Ljava/util/ArrayList;
    //   116: iload_3
    //   117: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: invokevirtual 199	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   123: pop
    //   124: iload_3
    //   125: iconst_1
    //   126: iadd
    //   127: istore_3
    //   128: goto -48 -> 80
    //   131: getstatic 77	android/support/v4/app/n:DEBUG	Z
    //   134: ifeq +26 -> 160
    //   137: new 174	java/lang/StringBuilder
    //   140: dup
    //   141: ldc -47
    //   143: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: iload_1
    //   147: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: ldc -45
    //   152: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload_2
    //   156: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_0
    //   161: getfield 166	android/support/v4/app/n:nP	Ljava/util/ArrayList;
    //   164: aload_2
    //   165: invokevirtual 199	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   168: pop
    //   169: goto -92 -> 77
    //   172: astore_2
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_2
    //   176: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	n
    //   0	177	1	paramInt	int
    //   0	177	2	parame	e
    //   31	97	3	i	int
    //   27	9	4	j	int
    // Exception table:
    //   from	to	target	type
    //   2	20	172	finally
    //   20	29	172	finally
    //   38	67	172	finally
    //   67	77	172	finally
    //   77	79	172	finally
    //   85	112	172	finally
    //   112	124	172	finally
    //   131	160	172	finally
    //   160	169	172	finally
    //   173	175	172	finally
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    paramRuntimeException.getMessage();
    PrintWriter localPrintWriter = new PrintWriter(new d("FragmentManager"));
    if (this.mHost != null) {}
    try
    {
      this.mHost.a("  ", localPrintWriter, new String[0]);
      for (;;)
      {
        throw paramRuntimeException;
        try
        {
          dump("  ", null, localPrintWriter, new String[0]);
        }
        catch (Exception localException1) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  static boolean a(View paramView, Animation paramAnimation)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = bool2;
      if (z.H(paramView) == 0)
      {
        bool1 = bool2;
        if (z.ac(paramView))
        {
          if (!(paramAnimation instanceof AlphaAnimation)) {
            break label54;
          }
          i = 1;
        }
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (i != 0) {
        bool1 = true;
      }
      return bool1;
      label54:
      if ((paramAnimation instanceof AnimationSet))
      {
        paramView = ((AnimationSet)paramAnimation).getAnimations();
        i = 0;
        for (;;)
        {
          if (i >= paramView.size()) {
            break label106;
          }
          if ((paramView.get(i) instanceof AlphaAnimation))
          {
            i = 1;
            break;
          }
          i += 1;
        }
      }
      label106:
      i = 0;
    }
  }
  
  private static Animation b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(oe);
    ((ScaleAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(of);
    ((AlphaAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private static void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    while (!a(paramView, paramAnimation)) {
      return;
    }
    try
    {
      if (nV == null)
      {
        localObject1 = Animation.class.getDeclaredField("mListener");
        nV = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
      }
      localObject1 = (Animation.AnimationListener)nV.get(paramAnimation);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    paramAnimation.setAnimationListener(new a(paramView, paramAnimation, (Animation.AnimationListener)localObject1));
  }
  
  private void bm()
  {
    if (this.nX) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.nZ != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.nZ);
    }
  }
  
  private void g(Fragment paramFragment)
  {
    a(paramFragment, this.nS, 0, 0, false);
  }
  
  private void i(Fragment paramFragment)
  {
    if (paramFragment.mInnerView == null) {
      return;
    }
    if (this.oc == null) {
      this.oc = new SparseArray();
    }
    for (;;)
    {
      paramFragment.mInnerView.saveHierarchyState(this.oc);
      if (this.oc.size() <= 0) {
        break;
      }
      paramFragment.mSavedViewState = this.oc;
      this.oc = null;
      return;
      this.oc.clear();
    }
  }
  
  private Bundle j(Fragment paramFragment)
  {
    if (this.ob == null) {
      this.ob = new Bundle();
    }
    paramFragment.performSaveInstanceState(this.ob);
    Object localObject2;
    if (!this.ob.isEmpty())
    {
      localObject2 = this.ob;
      this.ob = null;
    }
    for (;;)
    {
      if (paramFragment.mView != null) {
        i(paramFragment);
      }
      Object localObject1 = localObject2;
      if (paramFragment.mSavedViewState != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramFragment.mSavedViewState);
      }
      localObject2 = localObject1;
      if (!paramFragment.mUserVisibleHint)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramFragment.mUserVisibleHint);
      }
      return (Bundle)localObject2;
      localObject2 = null;
    }
  }
  
  private static Animation q(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(of);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  public final Fragment J(String paramString)
  {
    int i;
    Object localObject;
    if ((this.nL != null) && (paramString != null))
    {
      i = this.nL.size() - 1;
      while (i >= 0)
      {
        localObject = (Fragment)this.nL.get(i);
        if ((localObject != null) && (paramString.equals(((Fragment)localObject).mTag))) {
          return (Fragment)localObject;
        }
        i -= 1;
      }
    }
    if ((this.nK != null) && (paramString != null))
    {
      i = this.nK.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label126;
        }
        Fragment localFragment = (Fragment)this.nK.get(i);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (paramString.equals(localFragment.mTag)) {
            break;
          }
        }
        i -= 1;
      }
    }
    label126:
    return null;
  }
  
  public final Fragment R(int paramInt)
  {
    int i;
    Object localObject;
    if (this.nL != null)
    {
      i = this.nL.size() - 1;
      while (i >= 0)
      {
        localObject = (Fragment)this.nL.get(i);
        if ((localObject != null) && (((Fragment)localObject).mFragmentId == paramInt)) {
          return (Fragment)localObject;
        }
        i -= 1;
      }
    }
    if (this.nK != null)
    {
      i = this.nK.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label112;
        }
        Fragment localFragment = (Fragment)this.nK.get(i);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (localFragment.mFragmentId == paramInt) {
            break;
          }
        }
        i -= 1;
      }
    }
    label112:
    return null;
  }
  
  public final void S(final int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt);
    }
    a(new Runnable()
    {
      public final void run()
      {
        n localn = n.this;
        l locall = n.this.mHost;
        localn.m(paramInt, this.oj);
      }
    }, false);
  }
  
  final void T(int paramInt)
  {
    a(paramInt, 0, 0, false);
  }
  
  public final int a(e parame)
  {
    try
    {
      if ((this.nQ == null) || (this.nQ.size() <= 0))
      {
        if (this.nP == null) {
          this.nP = new ArrayList();
        }
        i = this.nP.size();
        if (DEBUG) {
          new StringBuilder("Setting back stack index ").append(i).append(" to ").append(parame);
        }
        this.nP.add(parame);
        return i;
      }
      int i = ((Integer)this.nQ.remove(this.nQ.size() - 1)).intValue();
      if (DEBUG) {
        new StringBuilder("Adding back stack index ").append(i).append(" with ").append(parame);
      }
      this.nP.set(i, parame);
      return i;
    }
    finally {}
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.mHost == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No host");
    }
    if ((!paramBoolean) && (this.nS == paramInt1)) {}
    do
    {
      return;
      this.nS = paramInt1;
    } while (this.nK == null);
    int i = 0;
    boolean bool = false;
    label54:
    if (i < this.nK.size())
    {
      Fragment localFragment = (Fragment)this.nK.get(i);
      if (localFragment == null) {
        break label169;
      }
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.mLoaderManager == null) {
        break label169;
      }
      bool |= localFragment.mLoaderManager.bq();
    }
    label169:
    for (;;)
    {
      i += 1;
      break label54;
      if (!bool) {
        bl();
      }
      if ((!this.nW) || (this.mHost == null) || (this.nS != 5)) {
        break;
      }
      this.mHost.bi();
      this.nW = false;
      return;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }
  
  public final void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("remove: ").append(paramFragment).append(" nesting=").append(paramFragment.mBackStackNesting);
    }
    if (!paramFragment.isInBackStack())
    {
      i = 1;
      if ((!paramFragment.mDetached) || (i != 0))
      {
        if (this.nL != null) {
          this.nL.remove(paramFragment);
        }
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.nW = true;
        }
        paramFragment.mAdded = false;
        paramFragment.mRemoving = true;
        if (i == 0) {
          break label126;
        }
      }
    }
    label126:
    for (int i = 0;; i = 1)
    {
      a(paramFragment, i, paramInt1, paramInt2, false);
      return;
      i = 0;
      break;
    }
  }
  
  final void a(final Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i;
    if (paramFragment.mAdded)
    {
      i = paramInt1;
      if (!paramFragment.mDetached) {}
    }
    else
    {
      i = paramInt1;
      if (paramInt1 > 1) {
        i = 1;
      }
    }
    int j = i;
    if (paramFragment.mRemoving)
    {
      j = i;
      if (i > paramFragment.mState) {
        j = paramFragment.mState;
      }
    }
    paramInt1 = j;
    if (paramFragment.mDeferStart)
    {
      paramInt1 = j;
      if (paramFragment.mState < 4)
      {
        paramInt1 = j;
        if (j > 3) {
          paramInt1 = 3;
        }
      }
    }
    int k;
    label583:
    label615:
    Object localObject2;
    if (paramFragment.mState < paramInt1)
    {
      if ((paramFragment.mFromLayout) && (!paramFragment.mInLayout)) {}
      do
      {
        return;
        if (paramFragment.mAnimatingAway != null)
        {
          paramFragment.mAnimatingAway = null;
          a(paramFragment, paramFragment.mStateAfterAnimating, 0, 0, true);
        }
        i = paramInt1;
        k = paramInt1;
        j = paramInt1;
        switch (paramFragment.mState)
        {
        default: 
          i = paramInt1;
        }
      } while (paramFragment.mState == i);
      new StringBuilder("moveToState: Fragment state for ").append(paramFragment).append(" not updated inline; expected state ").append(i).append(" found ").append(paramFragment.mState);
      paramFragment.mState = i;
      return;
      if (DEBUG) {
        new StringBuilder("moveto CREATED: ").append(paramFragment);
      }
      j = paramInt1;
      if (paramFragment.mSavedFragmentState != null)
      {
        paramFragment.mSavedFragmentState.setClassLoader(this.mHost.mContext.getClassLoader());
        paramFragment.mSavedViewState = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        paramFragment.mTarget = c(paramFragment.mSavedFragmentState, "android:target_state");
        if (paramFragment.mTarget != null) {
          paramFragment.mTargetRequestCode = paramFragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        paramFragment.mUserVisibleHint = paramFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        j = paramInt1;
        if (!paramFragment.mUserVisibleHint)
        {
          paramFragment.mDeferStart = true;
          j = paramInt1;
          if (paramInt1 > 3) {
            j = 3;
          }
        }
      }
      paramFragment.mHost = this.mHost;
      paramFragment.mParentFragment = this.nU;
      if (this.nU != null) {}
      for (localObject1 = this.nU.mChildFragmentManager;; localObject1 = this.mHost.mFragmentManager)
      {
        paramFragment.mFragmentManager = ((n)localObject1);
        paramFragment.mCalled = false;
        paramFragment.onAttach(this.mHost.mContext);
        if (paramFragment.mCalled) {
          break;
        }
        throw new am("Fragment " + paramFragment + " did not call through to super.onAttach()");
      }
      if (paramFragment.mParentFragment == null) {
        this.mHost.onAttachFragment(paramFragment);
      }
      if (!paramFragment.mRetaining) {
        paramFragment.performCreate(paramFragment.mSavedFragmentState);
      }
      paramFragment.mRetaining = false;
      i = j;
      if (paramFragment.mFromLayout)
      {
        paramFragment.mView = paramFragment.performCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), null, paramFragment.mSavedFragmentState);
        if (paramFragment.mView == null) {
          break label1035;
        }
        paramFragment.mInnerView = paramFragment.mView;
        if (Build.VERSION.SDK_INT >= 11)
        {
          z.ab(paramFragment.mView);
          if (paramFragment.mHidden) {
            paramFragment.mView.setVisibility(8);
          }
          paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
          i = j;
        }
      }
      else
      {
        k = i;
        if (i > 1)
        {
          if (DEBUG) {
            new StringBuilder("moveto ACTIVITY_CREATED: ").append(paramFragment);
          }
          if (!paramFragment.mFromLayout)
          {
            if (paramFragment.mContainerId == 0) {
              break label1677;
            }
            localObject2 = (ViewGroup)this.nT.onFindViewById(paramFragment.mContainerId);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (!paramFragment.mRestored) {
                a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.mContainerId) + " (" + paramFragment.getResources().getResourceName(paramFragment.mContainerId) + ") for fragment " + paramFragment));
              }
            }
          }
        }
      }
    }
    label822:
    label1035:
    label1126:
    label1445:
    label1671:
    label1677:
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      paramFragment.mContainer = ((ViewGroup)localObject1);
      paramFragment.mView = paramFragment.performCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), (ViewGroup)localObject1, paramFragment.mSavedFragmentState);
      if (paramFragment.mView != null)
      {
        paramFragment.mInnerView = paramFragment.mView;
        if (Build.VERSION.SDK_INT >= 11)
        {
          z.ab(paramFragment.mView);
          if (localObject1 != null)
          {
            localObject2 = a(paramFragment, paramInt2, true, paramInt3);
            if (localObject2 != null)
            {
              b(paramFragment.mView, (Animation)localObject2);
              paramFragment.mView.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramFragment.mView);
          }
          if (paramFragment.mHidden) {
            paramFragment.mView.setVisibility(8);
          }
          paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        }
      }
      for (;;)
      {
        paramFragment.performActivityCreated(paramFragment.mSavedFragmentState);
        if (paramFragment.mView != null) {
          paramFragment.restoreViewState(paramFragment.mSavedFragmentState);
        }
        paramFragment.mSavedFragmentState = null;
        k = i;
        j = k;
        if (k > 3)
        {
          if (DEBUG) {
            new StringBuilder("moveto STARTED: ").append(paramFragment);
          }
          paramFragment.performStart();
          j = k;
        }
        i = j;
        if (j <= 4) {
          break;
        }
        if (DEBUG) {
          new StringBuilder("moveto RESUMED: ").append(paramFragment);
        }
        paramFragment.performResume();
        paramFragment.mSavedFragmentState = null;
        paramFragment.mSavedViewState = null;
        i = j;
        break;
        paramFragment.mView = w.y(paramFragment.mView);
        break label583;
        paramFragment.mInnerView = null;
        i = j;
        break label615;
        paramFragment.mView = w.y(paramFragment.mView);
        break label822;
        paramFragment.mInnerView = null;
      }
      i = paramInt1;
      if (paramFragment.mState <= paramInt1) {
        break;
      }
      switch (paramFragment.mState)
      {
      default: 
        i = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i = paramInt1;
          if (paramInt1 > 0) {
            break;
          }
          if ((this.nY) && (paramFragment.mAnimatingAway != null))
          {
            localObject1 = paramFragment.mAnimatingAway;
            paramFragment.mAnimatingAway = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramFragment.mAnimatingAway == null) {
            break label1445;
          }
          paramFragment.mStateAfterAnimating = paramInt1;
          i = 1;
          break;
          if (paramInt1 < 5)
          {
            if (DEBUG) {
              new StringBuilder("movefrom RESUMED: ").append(paramFragment);
            }
            paramFragment.performPause();
          }
          if (paramInt1 < 4)
          {
            if (DEBUG) {
              new StringBuilder("movefrom STARTED: ").append(paramFragment);
            }
            paramFragment.performStop();
          }
          if (paramInt1 < 3)
          {
            if (DEBUG) {
              new StringBuilder("movefrom STOPPED: ").append(paramFragment);
            }
            paramFragment.performReallyStop();
          }
        } while (paramInt1 >= 2);
        if (DEBUG) {
          new StringBuilder("movefrom ACTIVITY_CREATED: ").append(paramFragment);
        }
        if ((paramFragment.mView != null) && (this.mHost.bh()) && (paramFragment.mSavedViewState == null)) {
          i(paramFragment);
        }
        paramFragment.performDestroyView();
        if ((paramFragment.mView != null) && (paramFragment.mContainer != null)) {
          if ((this.nS <= 0) || (this.nY)) {
            break label1671;
          }
        }
        for (localObject1 = a(paramFragment, paramInt2, false, paramInt3);; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramFragment.mAnimatingAway = paramFragment.mView;
            paramFragment.mStateAfterAnimating = paramInt1;
            ((Animation)localObject1).setAnimationListener(new a(paramFragment.mView, (Animation)localObject1)
            {
              public final void onAnimationEnd(Animation paramAnonymousAnimation)
              {
                super.onAnimationEnd(paramAnonymousAnimation);
                if (paramFragment.mAnimatingAway != null)
                {
                  paramFragment.mAnimatingAway = null;
                  n.this.a(paramFragment, paramFragment.mStateAfterAnimating, 0, 0, false);
                }
              }
            });
            paramFragment.mView.startAnimation((Animation)localObject1);
          }
          paramFragment.mContainer.removeView(paramFragment.mView);
          paramFragment.mContainer = null;
          paramFragment.mView = null;
          paramFragment.mInnerView = null;
          break label1126;
          if (DEBUG) {
            new StringBuilder("movefrom CREATED: ").append(paramFragment);
          }
          if (!paramFragment.mRetaining) {
            paramFragment.performDestroy();
          }
          for (;;)
          {
            paramFragment.mCalled = false;
            paramFragment.onDetach();
            if (paramFragment.mCalled) {
              break;
            }
            throw new am("Fragment " + paramFragment + " did not call through to super.onDetach()");
            paramFragment.mState = 0;
          }
          i = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!paramFragment.mRetaining)
          {
            i = paramInt1;
            if (paramFragment.mIndex < 0) {
              break;
            }
            if (DEBUG) {
              new StringBuilder("Freeing fragment index ").append(paramFragment);
            }
            this.nK.set(paramFragment.mIndex, null);
            if (this.nM == null) {
              this.nM = new ArrayList();
            }
            this.nM.add(Integer.valueOf(paramFragment.mIndex));
            this.mHost.I(paramFragment.mWho);
            paramFragment.initState();
            i = paramInt1;
            break;
          }
          paramFragment.mHost = null;
          paramFragment.mParentFragment = null;
          paramFragment.mFragmentManager = null;
          paramFragment.mChildFragmentManager = null;
          i = paramInt1;
          break;
        }
      }
    }
  }
  
  public final void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.nL == null) {
      this.nL = new ArrayList();
    }
    if (DEBUG) {
      new StringBuilder("add: ").append(paramFragment);
    }
    h(paramFragment);
    if (!paramFragment.mDetached)
    {
      if (this.nL.contains(paramFragment)) {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
      }
      this.nL.add(paramFragment);
      paramFragment.mAdded = true;
      paramFragment.mRemoving = false;
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.nW = true;
      }
      if (paramBoolean) {
        g(paramFragment);
      }
    }
  }
  
  public final void a(l paraml, j paramj, Fragment paramFragment)
  {
    if (this.mHost != null) {
      throw new IllegalStateException("Already attached");
    }
    this.mHost = paraml;
    this.nT = paramj;
    this.nU = paramFragment;
  }
  
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean) {
      bm();
    }
    try
    {
      if ((this.nY) || (this.mHost == null)) {
        throw new IllegalStateException("Activity has been destroyed");
      }
    }
    finally
    {
      throw paramRunnable;
      if (this.nH == null) {
        this.nH = new ArrayList();
      }
      this.nH.add(paramRunnable);
      if (this.nH.size() == 1) {
        this.mHost.mHandler.removeCallbacks(this.od);
      }
    }
  }
  
  public final void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("hide: ").append(paramFragment);
    }
    if (!paramFragment.mHidden)
    {
      paramFragment.mHidden = true;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.mView, localAnimation);
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(8);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.nW = true;
      }
      paramFragment.onHiddenChanged(true);
    }
  }
  
  public final q bk()
  {
    return new e(this);
  }
  
  final void bl()
  {
    if (this.nK == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.nK.size())
      {
        Fragment localFragment = (Fragment)this.nK.get(i);
        if (localFragment != null) {
          f(localFragment);
        }
        i += 1;
      }
    }
  }
  
  final void bn()
  {
    if (this.nR != null)
    {
      int i = 0;
      while (i < this.nR.size())
      {
        this.nR.get(i);
        i += 1;
      }
    }
  }
  
  public final Fragment c(Bundle paramBundle, String paramString)
  {
    int i = paramBundle.getInt(paramString, -1);
    if (i == -1) {
      paramBundle = null;
    }
    Fragment localFragment;
    do
    {
      return paramBundle;
      if (i >= this.nK.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i));
      }
      localFragment = (Fragment)this.nK.get(i);
      paramBundle = localFragment;
    } while (localFragment != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i));
    return localFragment;
  }
  
  public final void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("show: ").append(paramFragment);
    }
    if (paramFragment.mHidden)
    {
      paramFragment.mHidden = false;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.mView, localAnimation);
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(0);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.nW = true;
      }
      paramFragment.onHiddenChanged(false);
    }
  }
  
  public final void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("detach: ").append(paramFragment);
    }
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.mAdded)
      {
        if (this.nL != null)
        {
          if (DEBUG) {
            new StringBuilder("remove from detach: ").append(paramFragment);
          }
          this.nL.remove(paramFragment);
        }
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.nW = true;
        }
        paramFragment.mAdded = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final void dispatchActivityCreated()
  {
    this.nX = false;
    T(2);
  }
  
  public final void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.nL != null)
    {
      int i = 0;
      while (i < this.nL.size())
      {
        Fragment localFragment = (Fragment)this.nL.get(i);
        if (localFragment != null) {
          localFragment.performConfigurationChanged(paramConfiguration);
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (this.nL != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < this.nL.size())
      {
        Fragment localFragment = (Fragment)this.nL.get(i);
        if ((localFragment != null) && (localFragment.performContextItemSelected(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final void dispatchCreate()
  {
    this.nX = false;
    T(1);
  }
  
  public final boolean dispatchCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int j = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i;
    if (this.nL != null)
    {
      i = 0;
      boolean bool1 = false;
      for (;;)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (i >= this.nL.size()) {
          break;
        }
        Fragment localFragment = (Fragment)this.nL.get(i);
        localObject2 = localObject1;
        bool2 = bool1;
        if (localFragment != null)
        {
          localObject2 = localObject1;
          bool2 = bool1;
          if (localFragment.performCreateOptionsMenu(paramMenu, paramMenuInflater))
          {
            bool2 = true;
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localFragment);
          }
        }
        i += 1;
        bool1 = bool2;
        localObject1 = localObject2;
      }
    }
    boolean bool2 = false;
    if (this.nO != null)
    {
      i = j;
      while (i < this.nO.size())
      {
        paramMenu = (Fragment)this.nO.get(i);
        if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
          paramMenu.onDestroyOptionsMenu();
        }
        i += 1;
      }
    }
    this.nO = ((ArrayList)localObject2);
    return bool2;
  }
  
  public final void dispatchDestroy()
  {
    this.nY = true;
    execPendingActions();
    T(0);
    this.mHost = null;
    this.nT = null;
    this.nU = null;
  }
  
  public final void dispatchLowMemory()
  {
    if (this.nL != null)
    {
      int i = 0;
      while (i < this.nL.size())
      {
        Fragment localFragment = (Fragment)this.nL.get(i);
        if (localFragment != null) {
          localFragment.performLowMemory();
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (this.nL != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < this.nL.size())
      {
        Fragment localFragment = (Fragment)this.nL.get(i);
        if ((localFragment != null) && (localFragment.performOptionsItemSelected(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final void dispatchOptionsMenuClosed(Menu paramMenu)
  {
    if (this.nL != null)
    {
      int i = 0;
      while (i < this.nL.size())
      {
        Fragment localFragment = (Fragment)this.nL.get(i);
        if (localFragment != null) {
          localFragment.performOptionsMenuClosed(paramMenu);
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.nL != null)
    {
      int i = 0;
      for (boolean bool1 = false;; bool1 = bool2)
      {
        bool2 = bool1;
        if (i >= this.nL.size()) {
          break;
        }
        Fragment localFragment = (Fragment)this.nL.get(i);
        bool2 = bool1;
        if (localFragment != null)
        {
          bool2 = bool1;
          if (localFragment.performPrepareOptionsMenu(paramMenu)) {
            bool2 = true;
          }
        }
        i += 1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public final void dispatchResume()
  {
    this.nX = false;
    T(5);
  }
  
  public final void dispatchStart()
  {
    this.nX = false;
    T(4);
  }
  
  public final void dispatchStop()
  {
    this.nX = true;
    T(3);
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str = paramString + "    ";
    int k;
    int i;
    if (this.nK != null)
    {
      k = this.nK.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i = 0;
        while (i < k)
        {
          Fragment localFragment = (Fragment)this.nK.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment);
          if (localFragment != null) {
            localFragment.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i += 1;
        }
      }
    }
    if (this.nL != null)
    {
      k = this.nL.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (Fragment)this.nL.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i += 1;
        }
      }
    }
    if (this.nO != null)
    {
      k = this.nO.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (Fragment)this.nO.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i += 1;
        }
      }
    }
    if (this.nN != null)
    {
      k = this.nN.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (e)this.nN.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          paramFileDescriptor.a(str, paramPrintWriter);
          i += 1;
        }
      }
    }
    try
    {
      if (this.nP != null)
      {
        k = this.nP.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i = 0;
          while (i < k)
          {
            paramFileDescriptor = (e)this.nP.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i += 1;
          }
        }
      }
      if ((this.nQ != null) && (this.nQ.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.nQ.toArray()));
      }
      if (this.nH != null)
      {
        k = this.nH.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i = j;
          while (i < k)
          {
            paramFileDescriptor = (Runnable)this.nH.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.mHost);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.nT);
    if (this.nU != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.nU);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.nS);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.nX);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.nY);
    if (this.nW)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.nW);
    }
    if (this.nZ != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.nZ);
    }
    if ((this.nM != null) && (this.nM.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.nM.toArray()));
    }
  }
  
  public final Fragment.SavedState e(Fragment paramFragment)
  {
    Object localObject2 = null;
    if (paramFragment.mIndex < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    Object localObject1 = localObject2;
    if (paramFragment.mState > 0)
    {
      paramFragment = j(paramFragment);
      localObject1 = localObject2;
      if (paramFragment != null) {
        localObject1 = new Fragment.SavedState(paramFragment);
      }
    }
    return (Fragment.SavedState)localObject1;
  }
  
  public final void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("attach: ").append(paramFragment);
    }
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.mAdded)
      {
        if (this.nL == null) {
          this.nL = new ArrayList();
        }
        if (this.nL.contains(paramFragment)) {
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        }
        if (DEBUG) {
          new StringBuilder("add from attach: ").append(paramFragment);
        }
        this.nL.add(paramFragment);
        paramFragment.mAdded = true;
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.nW = true;
        }
        a(paramFragment, this.nS, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final boolean execPendingActions()
  {
    if (this.nJ) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.mHost.mHandler.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    int j;
    for (boolean bool = false;; bool = true) {
      try
      {
        if ((this.nH == null) || (this.nH.size() == 0))
        {
          if (!this.oa) {
            break label276;
          }
          i = 0;
          int m;
          for (j = 0; i < this.nK.size(); j = m)
          {
            Fragment localFragment = (Fragment)this.nK.get(i);
            int k = j;
            if (localFragment != null)
            {
              k = j;
              if (localFragment.mLoaderManager != null) {
                m = j | localFragment.mLoaderManager.bq();
              }
            }
            i += 1;
          }
        }
        j = this.nH.size();
        if ((this.nI == null) || (this.nI.length < j)) {
          this.nI = new Runnable[j];
        }
        this.nH.toArray(this.nI);
        this.nH.clear();
        this.mHost.mHandler.removeCallbacks(this.od);
        this.nJ = true;
        int i = 0;
        while (i < j)
        {
          this.nI[i].run();
          this.nI[i] = null;
          i += 1;
        }
        this.nJ = false;
      }
      finally {}
    }
    if (j == 0)
    {
      this.oa = false;
      bl();
    }
    label276:
    return bool;
  }
  
  public final boolean executePendingTransactions()
  {
    return execPendingActions();
  }
  
  public final void f(Fragment paramFragment)
  {
    if (paramFragment.mDeferStart)
    {
      if (this.nJ) {
        this.oa = true;
      }
    }
    else {
      return;
    }
    paramFragment.mDeferStart = false;
    a(paramFragment, this.nS, 0, 0, false);
  }
  
  public final Fragment findFragmentByWho(String paramString)
  {
    if ((this.nK != null) && (paramString != null))
    {
      int i = this.nK.size() - 1;
      while (i >= 0)
      {
        Fragment localFragment = (Fragment)this.nK.get(i);
        if (localFragment != null)
        {
          localFragment = localFragment.findFragmentByWho(paramString);
          if (localFragment != null) {
            return localFragment;
          }
        }
        i -= 1;
      }
    }
    return null;
  }
  
  public final int getBackStackEntryCount()
  {
    if (this.nN != null) {
      return this.nN.size();
    }
    return 0;
  }
  
  public final List<Fragment> getFragments()
  {
    return this.nK;
  }
  
  final void h(Fragment paramFragment)
  {
    if (paramFragment.mIndex >= 0) {}
    for (;;)
    {
      return;
      if ((this.nM == null) || (this.nM.size() <= 0))
      {
        if (this.nK == null) {
          this.nK = new ArrayList();
        }
        paramFragment.setIndex(this.nK.size(), this.nU);
        this.nK.add(paramFragment);
      }
      while (DEBUG)
      {
        new StringBuilder("Allocated fragment index ").append(paramFragment);
        return;
        paramFragment.setIndex(((Integer)this.nM.remove(this.nM.size() - 1)).intValue(), this.nU);
        this.nK.set(paramFragment.mIndex, paramFragment);
      }
    }
  }
  
  public final boolean isDestroyed()
  {
    return this.nY;
  }
  
  final boolean m(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    if (this.nN == null) {}
    int i;
    do
    {
      int j;
      do
      {
        do
        {
          return false;
          if ((paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
            break;
          }
          paramInt1 = this.nN.size() - 1;
        } while (paramInt1 < 0);
        localObject1 = (e)this.nN.remove(paramInt1);
        localObject2 = new SparseArray();
        localSparseArray1 = new SparseArray();
        ((e)localObject1).b((SparseArray)localObject2, localSparseArray1);
        ((e)localObject1).a(true, null, (SparseArray)localObject2, localSparseArray1);
        bn();
        return true;
        i = -1;
        if (paramInt1 < 0) {
          break;
        }
        j = this.nN.size() - 1;
        while (j >= 0)
        {
          localObject2 = (e)this.nN.get(j);
          if ((paramInt1 >= 0) && (paramInt1 == ((e)localObject2).mIndex)) {
            break;
          }
          j -= 1;
        }
      } while (j < 0);
      i = j;
      if ((paramInt2 & 0x1) != 0)
      {
        paramInt2 = j - 1;
        for (;;)
        {
          i = paramInt2;
          if (paramInt2 < 0) {
            break;
          }
          localObject2 = (e)this.nN.get(paramInt2);
          i = paramInt2;
          if (paramInt1 < 0) {
            break;
          }
          i = paramInt2;
          if (paramInt1 != ((e)localObject2).mIndex) {
            break;
          }
          paramInt2 -= 1;
        }
      }
    } while (i == this.nN.size() - 1);
    Object localObject2 = new ArrayList();
    paramInt1 = this.nN.size() - 1;
    while (paramInt1 > i)
    {
      ((ArrayList)localObject2).add(this.nN.remove(paramInt1));
      paramInt1 -= 1;
    }
    paramInt2 = ((ArrayList)localObject2).size() - 1;
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    paramInt1 = 0;
    while (paramInt1 <= paramInt2)
    {
      ((e)((ArrayList)localObject2).get(paramInt1)).b(localSparseArray1, localSparseArray2);
      paramInt1 += 1;
    }
    paramInt1 = 0;
    label330:
    e locale;
    if (paramInt1 <= paramInt2)
    {
      if (DEBUG) {
        new StringBuilder("Popping back stack state: ").append(((ArrayList)localObject2).get(paramInt1));
      }
      locale = (e)((ArrayList)localObject2).get(paramInt1);
      if (paramInt1 != paramInt2) {
        break label402;
      }
    }
    label402:
    for (boolean bool = true;; bool = false)
    {
      localObject1 = locale.a(bool, (e.b)localObject1, localSparseArray1, localSparseArray2);
      paramInt1 += 1;
      break label330;
      break;
    }
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, b.oq);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int k = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!Fragment.isSupportFragmentClass(this.mHost.mContext, str1)) {
        return null;
      }
      if (paramView != null) {}
      for (int i = paramView.getId(); (i == -1) && (k == -1) && (str2 == null); i = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int j;
      if (k != -1)
      {
        paramString = R(k);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = J(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i != -1) {
            paramString = R(i);
          }
        }
        if (DEBUG) {
          new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(k)).append(" fname=").append(str1).append(" existing=").append(paramString);
        }
        if (paramString != null) {
          break label413;
        }
        paramView = Fragment.instantiate(paramContext, str1);
        paramView.mFromLayout = true;
        if (k == 0) {
          break label406;
        }
        j = k;
        label280:
        paramView.mFragmentId = j;
        paramView.mContainerId = i;
        paramView.mTag = str2;
        paramView.mInLayout = true;
        paramView.mFragmentManager = this;
        paramView.mHost = this.mHost;
        paramView.onInflate(this.mHost.mContext, paramAttributeSet, paramView.mSavedFragmentState);
        a(paramView, true);
        label339:
        if ((this.nS > 0) || (!paramView.mFromLayout)) {
          break label540;
        }
        a(paramView, 1, 0, 0, false);
      }
      for (;;)
      {
        if (paramView.mView != null) {
          break label548;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label406:
        j = i;
        break label280;
        label413:
        if (paramString.mInLayout) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(k) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str1);
        }
        paramString.mInLayout = true;
        paramString.mHost = this.mHost;
        if (!paramString.mRetaining) {
          paramString.onInflate(this.mHost.mContext, paramAttributeSet, paramString.mSavedFragmentState);
        }
        paramView = paramString;
        break label339;
        label540:
        g(paramView);
      }
      label548:
      if (k != 0) {
        paramView.mView.setId(k);
      }
      if (paramView.mView.getTag() == null) {
        paramView.mView.setTag(str2);
      }
      return paramView.mView;
    }
  }
  
  public final void popBackStack()
  {
    a(new Runnable()
    {
      public final void run()
      {
        n localn = n.this;
        l locall = n.this.mHost;
        localn.m(-1, 0);
      }
    }, false);
  }
  
  public final boolean popBackStackImmediate()
  {
    bm();
    execPendingActions();
    return m(-1, 0);
  }
  
  final void restoreAllState(Parcelable paramParcelable, List<Fragment> paramList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      paramParcelable = (FragmentManagerState)paramParcelable;
      if (paramParcelable.or != null)
      {
        Object localObject1;
        Object localObject2;
        if (paramList != null)
        {
          i = 0;
          while (i < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i);
            if (DEBUG) {
              new StringBuilder("restoreAllState: re-attaching retained ").append(localObject1);
            }
            localObject2 = paramParcelable.or[localObject1.mIndex];
            ((FragmentState)localObject2).oy = ((Fragment)localObject1);
            ((Fragment)localObject1).mSavedViewState = null;
            ((Fragment)localObject1).mBackStackNesting = 0;
            ((Fragment)localObject1).mInLayout = false;
            ((Fragment)localObject1).mAdded = false;
            ((Fragment)localObject1).mTarget = null;
            if (((FragmentState)localObject2).mSavedFragmentState != null)
            {
              ((FragmentState)localObject2).mSavedFragmentState.setClassLoader(this.mHost.mContext.getClassLoader());
              ((Fragment)localObject1).mSavedViewState = ((FragmentState)localObject2).mSavedFragmentState.getSparseParcelableArray("android:view_state");
              ((Fragment)localObject1).mSavedFragmentState = ((FragmentState)localObject2).mSavedFragmentState;
            }
            i += 1;
          }
        }
        this.nK = new ArrayList(paramParcelable.or.length);
        if (this.nM != null) {
          this.nM.clear();
        }
        int i = 0;
        if (i < paramParcelable.or.length)
        {
          localObject1 = paramParcelable.or[i];
          if (localObject1 != null)
          {
            localObject2 = this.mHost;
            Fragment localFragment = this.nU;
            if (((FragmentState)localObject1).oy == null)
            {
              Context localContext = ((l)localObject2).mContext;
              if (((FragmentState)localObject1).mArguments != null) {
                ((FragmentState)localObject1).mArguments.setClassLoader(localContext.getClassLoader());
              }
              ((FragmentState)localObject1).oy = Fragment.instantiate(localContext, ((FragmentState)localObject1).ox, ((FragmentState)localObject1).mArguments);
              if (((FragmentState)localObject1).mSavedFragmentState != null)
              {
                ((FragmentState)localObject1).mSavedFragmentState.setClassLoader(localContext.getClassLoader());
                ((FragmentState)localObject1).oy.mSavedFragmentState = ((FragmentState)localObject1).mSavedFragmentState;
              }
              ((FragmentState)localObject1).oy.setIndex(((FragmentState)localObject1).mIndex, localFragment);
              ((FragmentState)localObject1).oy.mFromLayout = ((FragmentState)localObject1).mFromLayout;
              ((FragmentState)localObject1).oy.mRestored = true;
              ((FragmentState)localObject1).oy.mFragmentId = ((FragmentState)localObject1).mFragmentId;
              ((FragmentState)localObject1).oy.mContainerId = ((FragmentState)localObject1).mContainerId;
              ((FragmentState)localObject1).oy.mTag = ((FragmentState)localObject1).mTag;
              ((FragmentState)localObject1).oy.mRetainInstance = ((FragmentState)localObject1).mRetainInstance;
              ((FragmentState)localObject1).oy.mDetached = ((FragmentState)localObject1).mDetached;
              ((FragmentState)localObject1).oy.mFragmentManager = ((l)localObject2).mFragmentManager;
              if (DEBUG) {
                new StringBuilder("Instantiated fragment ").append(((FragmentState)localObject1).oy);
              }
            }
            localObject2 = ((FragmentState)localObject1).oy;
            if (DEBUG) {
              new StringBuilder("restoreAllState: active #").append(i).append(": ").append(localObject2);
            }
            this.nK.add(localObject2);
            ((FragmentState)localObject1).oy = null;
          }
          for (;;)
          {
            i += 1;
            break;
            this.nK.add(null);
            if (this.nM == null) {
              this.nM = new ArrayList();
            }
            this.nM.add(Integer.valueOf(i));
          }
        }
        if (paramList != null)
        {
          i = 0;
          if (i < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i);
            if (((Fragment)localObject1).mTargetIndex >= 0) {
              if (((Fragment)localObject1).mTargetIndex >= this.nK.size()) {
                break label653;
              }
            }
            for (((Fragment)localObject1).mTarget = ((Fragment)this.nK.get(((Fragment)localObject1).mTargetIndex));; ((Fragment)localObject1).mTarget = null)
            {
              i += 1;
              break;
              label653:
              new StringBuilder("Re-attaching retained fragment ").append(localObject1).append(" target no longer exists: ").append(((Fragment)localObject1).mTargetIndex);
            }
          }
        }
        if (paramParcelable.os != null)
        {
          this.nL = new ArrayList(paramParcelable.os.length);
          i = 0;
          while (i < paramParcelable.os.length)
          {
            paramList = (Fragment)this.nK.get(paramParcelable.os[i]);
            if (paramList == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + paramParcelable.os[i]));
            }
            paramList.mAdded = true;
            if (DEBUG) {
              new StringBuilder("restoreAllState: added #").append(i).append(": ").append(paramList);
            }
            if (this.nL.contains(paramList)) {
              throw new IllegalStateException("Already added!");
            }
            this.nL.add(paramList);
            i += 1;
          }
        }
        this.nL = null;
        if (paramParcelable.ot == null) {
          break;
        }
        this.nN = new ArrayList(paramParcelable.ot.length);
        i = 0;
        while (i < paramParcelable.ot.length)
        {
          paramList = paramParcelable.ot[i].a(this);
          if (DEBUG)
          {
            new StringBuilder("restoreAllState: back stack #").append(i).append(" (index ").append(paramList.mIndex).append("): ").append(paramList);
            paramList.a("  ", new PrintWriter(new d("FragmentManager")), false);
          }
          this.nN.add(paramList);
          if (paramList.mIndex >= 0) {
            a(paramList.mIndex, paramList);
          }
          i += 1;
        }
      }
    }
    this.nN = null;
  }
  
  final Parcelable saveAllState()
  {
    Object localObject3 = null;
    execPendingActions();
    if (nG) {
      this.nX = true;
    }
    if ((this.nK == null) || (this.nK.size() <= 0)) {
      return null;
    }
    int k = this.nK.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[k];
    int j = 0;
    int i = 0;
    label56:
    Object localObject1;
    Object localObject2;
    if (j < k)
    {
      localObject1 = (Fragment)this.nK.get(j);
      if (localObject1 == null) {
        break label659;
      }
      if (((Fragment)localObject1).mIndex < 0) {
        a(new IllegalStateException("Failure saving state: active " + localObject1 + " has cleared index: " + ((Fragment)localObject1).mIndex));
      }
      localObject2 = new FragmentState((Fragment)localObject1);
      arrayOfFragmentState[j] = localObject2;
      if ((((Fragment)localObject1).mState > 0) && (((FragmentState)localObject2).mSavedFragmentState == null))
      {
        ((FragmentState)localObject2).mSavedFragmentState = j((Fragment)localObject1);
        if (((Fragment)localObject1).mTarget != null)
        {
          if (((Fragment)localObject1).mTarget.mIndex < 0) {
            a(new IllegalStateException("Failure saving state: " + localObject1 + " has target not in fragment manager: " + ((Fragment)localObject1).mTarget));
          }
          if (((FragmentState)localObject2).mSavedFragmentState == null) {
            ((FragmentState)localObject2).mSavedFragmentState = new Bundle();
          }
          a(((FragmentState)localObject2).mSavedFragmentState, "android:target_state", ((Fragment)localObject1).mTarget);
          if (((Fragment)localObject1).mTargetRequestCode != 0) {
            ((FragmentState)localObject2).mSavedFragmentState.putInt("android:target_req_state", ((Fragment)localObject1).mTargetRequestCode);
          }
        }
        label297:
        if (DEBUG) {
          new StringBuilder("Saved state of ").append(localObject1).append(": ").append(((FragmentState)localObject2).mSavedFragmentState);
        }
        i = 1;
      }
    }
    label659:
    for (;;)
    {
      j += 1;
      break label56;
      ((FragmentState)localObject2).mSavedFragmentState = ((Fragment)localObject1).mSavedFragmentState;
      break label297;
      if (i == 0) {
        break;
      }
      if (this.nL != null)
      {
        j = this.nL.size();
        if (j > 0)
        {
          localObject2 = new int[j];
          i = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (i >= j) {
              break;
            }
            localObject2[i] = ((Fragment)this.nL.get(i)).mIndex;
            if (localObject2[i] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.nL.get(i) + " has cleared index: " + localObject2[i]));
            }
            if (DEBUG) {
              new StringBuilder("saveAllState: adding fragment #").append(i).append(": ").append(this.nL.get(i));
            }
            i += 1;
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.nN != null)
      {
        j = this.nN.size();
        localObject2 = localObject3;
        if (j > 0)
        {
          localObject3 = new BackStackState[j];
          i = 0;
          for (;;)
          {
            localObject2 = localObject3;
            if (i >= j) {
              break;
            }
            localObject3[i] = new BackStackState((e)this.nN.get(i));
            if (DEBUG) {
              new StringBuilder("saveAllState: adding back stack #").append(i).append(": ").append(this.nN.get(i));
            }
            i += 1;
          }
        }
      }
      localObject3 = new FragmentManagerState();
      ((FragmentManagerState)localObject3).or = arrayOfFragmentState;
      ((FragmentManagerState)localObject3).os = ((int[])localObject1);
      ((FragmentManagerState)localObject3).ot = ((BackStackState[])localObject2);
      return (Parcelable)localObject3;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.nU != null) {
      c.a(this.nU, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      c.a(this.mHost, localStringBuilder);
    }
  }
  
  static class a
    implements Animation.AnimationListener
  {
    private View mView = null;
    private Animation.AnimationListener ol = null;
    private boolean om = false;
    
    public a(View paramView, Animation paramAnimation)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      this.mView = paramView;
    }
    
    public a(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      this.ol = paramAnimationListener;
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((this.mView != null) && (this.om)) {
        this.mView.post(new Runnable()
        {
          public final void run()
          {
            z.a(n.a.a(n.a.this), 0, null);
          }
        });
      }
      if (this.ol != null) {
        this.ol.onAnimationEnd(paramAnimation);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      if (this.ol != null) {
        this.ol.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      if (this.mView != null)
      {
        this.om = n.a(this.mView, paramAnimation);
        if (this.om) {
          this.mView.post(new Runnable()
          {
            public final void run()
            {
              z.a(n.a.a(n.a.this), 2, null);
            }
          });
        }
      }
      if (this.ol != null) {
        this.ol.onAnimationStart(paramAnimation);
      }
    }
  }
  
  static final class b
  {
    public static final int[] oq = { 16842755, 16842960, 16842961 };
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */