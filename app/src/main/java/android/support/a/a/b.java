package android.support.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
public final class b
  extends e
  implements Animatable
{
  private a jw;
  private ArgbEvaluator jx = null;
  private final Drawable.Callback jy = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      b.this.invalidateSelf();
    }
    
    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      b.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      b.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private Context mContext;
  
  private b()
  {
    this(null, (byte)0);
  }
  
  private b(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private b(Context paramContext, byte paramByte)
  {
    this.mContext = paramContext;
    this.jw = new a();
  }
  
  public static b a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new b(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  private void b(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((List)localObject).size())
        {
          b((Animator)((List)localObject).get(i));
          i += 1;
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (this.jx == null) {
          this.jx = new ArgbEvaluator();
        }
        paramAnimator.setEvaluator(this.jx);
      }
    }
  }
  
  private boolean isStarted()
  {
    ArrayList localArrayList = this.jw.jC;
    if (localArrayList == null) {
      return false;
    }
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    if (this.jJ != null) {
      android.support.v4.b.a.a.a(this.jJ, paramTheme);
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (this.jJ != null) {
      return android.support.v4.b.a.a.e(this.jJ);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.jJ != null) {
      this.jJ.draw(paramCanvas);
    }
    do
    {
      return;
      this.jw.jB.draw(paramCanvas);
    } while (!isStarted());
    invalidateSelf();
  }
  
  public final int getAlpha()
  {
    if (this.jJ != null) {
      return android.support.v4.b.a.a.d(this.jJ);
    }
    return this.jw.jB.getAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    if (this.jJ != null) {
      return this.jJ.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.jw.jA;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (this.jJ != null) {
      return new b(this.jJ.getConstantState());
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    if (this.jJ != null) {
      return this.jJ.getIntrinsicHeight();
    }
    return this.jw.jB.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    if (this.jJ != null) {
      return this.jJ.getIntrinsicWidth();
    }
    return this.jw.jB.getIntrinsicWidth();
  }
  
  public final int getOpacity()
  {
    if (this.jJ != null) {
      return this.jJ.getOpacity();
    }
    return this.jw.jB.getOpacity();
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    label28:
    Object localObject1;
    label77:
    Object localObject2;
    if (i != 1) {
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        if (!"animated-vector".equals(localObject1)) {
          break label177;
        }
        localObject1 = a.ju;
        if (paramTheme != null) {
          break label162;
        }
        localObject1 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
        i = ((TypedArray)localObject1).getResourceId(0, 0);
        if (i != 0)
        {
          localObject2 = f.a(paramResources, i, paramTheme);
          ((f)localObject2).jP = false;
          ((f)localObject2).setCallback(this.jy);
          if (this.jw.jB != null) {
            this.jw.jB.setCallback(null);
          }
          this.jw.jB = ((f)localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    for (;;)
    {
      i = paramXmlPullParser.next();
      break label28;
      break;
      label162:
      localObject1 = paramTheme.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 0, 0);
      break label77;
      label177:
      if ("target".equals(localObject1))
      {
        localObject1 = paramResources.obtainAttributes(paramAttributeSet, a.jv);
        localObject2 = ((TypedArray)localObject1).getString(0);
        i = ((TypedArray)localObject1).getResourceId(1, 0);
        if (i != 0)
        {
          if (this.mContext == null) {
            break label352;
          }
          Animator localAnimator = AnimatorInflater.loadAnimator(this.mContext, i);
          localAnimator.setTarget(this.jw.jB.jL.kH.kG.get(localObject2));
          if (Build.VERSION.SDK_INT < 21) {
            b(localAnimator);
          }
          if (this.jw.jC == null)
          {
            this.jw.jC = new ArrayList();
            this.jw.jD = new android.support.v4.e.a();
          }
          this.jw.jC.add(localAnimator);
          this.jw.jD.put(localAnimator, localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    label352:
    throw new IllegalStateException("Context can't be null when inflating animators");
  }
  
  public final boolean isRunning()
  {
    if (this.jJ != null) {
      return ((AnimatedVectorDrawable)this.jJ).isRunning();
    }
    ArrayList localArrayList = this.jw.jC;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final boolean isStateful()
  {
    if (this.jJ != null) {
      return this.jJ.isStateful();
    }
    return this.jw.jB.isStateful();
  }
  
  public final Drawable mutate()
  {
    if (this.jJ != null)
    {
      this.jJ.mutate();
      return this;
    }
    throw new IllegalStateException("Mutate() is not supported for older platform");
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.jJ != null)
    {
      this.jJ.setBounds(paramRect);
      return;
    }
    this.jw.jB.setBounds(paramRect);
  }
  
  protected final boolean onLevelChange(int paramInt)
  {
    if (this.jJ != null) {
      return this.jJ.setLevel(paramInt);
    }
    return this.jw.jB.setLevel(paramInt);
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.jJ != null) {
      return this.jJ.setState(paramArrayOfInt);
    }
    return this.jw.jB.setState(paramArrayOfInt);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.jJ != null)
    {
      this.jJ.setAlpha(paramInt);
      return;
    }
    this.jw.jB.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.jJ != null)
    {
      this.jJ.setColorFilter(paramColorFilter);
      return;
    }
    this.jw.jB.setColorFilter(paramColorFilter);
  }
  
  public final void setTint(int paramInt)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramInt);
      return;
    }
    this.jw.jB.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramColorStateList);
      return;
    }
    this.jw.jB.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramMode);
      return;
    }
    this.jw.jB.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.jJ != null) {
      return this.jJ.setVisible(paramBoolean1, paramBoolean2);
    }
    this.jw.jB.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void start()
  {
    if (this.jJ != null) {
      ((AnimatedVectorDrawable)this.jJ).start();
    }
    while (isStarted()) {
      return;
    }
    ArrayList localArrayList = this.jw.jC;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      ((Animator)localArrayList.get(i)).start();
      i += 1;
    }
    invalidateSelf();
  }
  
  public final void stop()
  {
    if (this.jJ != null) {
      ((AnimatedVectorDrawable)this.jJ).stop();
    }
    for (;;)
    {
      return;
      ArrayList localArrayList = this.jw.jC;
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        ((Animator)localArrayList.get(i)).end();
        i += 1;
      }
    }
  }
  
  private static final class a
    extends Drawable.ConstantState
  {
    int jA;
    f jB;
    ArrayList<Animator> jC;
    android.support.v4.e.a<Animator, String> jD;
    
    public final int getChangingConfigurations()
    {
      return this.jA;
    }
    
    public final Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 23.");
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 23.");
    }
  }
  
  private static final class b
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState jE;
    
    public b(Drawable.ConstantState paramConstantState)
    {
      this.jE = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return this.jE.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return this.jE.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      b localb = new b((byte)0);
      localb.jJ = this.jE.newDrawable();
      localb.jJ.setCallback(b.a(localb));
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      b localb = new b((byte)0);
      localb.jJ = this.jE.newDrawable(paramResources);
      localb.jJ.setCallback(b.a(localb));
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      b localb = new b((byte)0);
      localb.jJ = this.jE.newDrawable(paramResources, paramTheme);
      localb.jJ.setCallback(b.a(localb));
      return localb;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */