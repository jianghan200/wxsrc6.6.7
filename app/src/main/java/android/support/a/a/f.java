package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
public final class f
  extends e
{
  static final PorterDuff.Mode jK = PorterDuff.Mode.SRC_IN;
  f jL;
  private PorterDuffColorFilter jM;
  private ColorFilter jN;
  private boolean jO;
  boolean jP = true;
  private Drawable.ConstantState jQ;
  private final float[] jR = new float[9];
  private final Matrix jS = new Matrix();
  private final Rect jT = new Rect();
  
  private f()
  {
    this.jL = new f();
  }
  
  private f(f paramf)
  {
    this.jL = paramf;
    this.jM = a(paramf.kI, paramf.kJ);
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public static f a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject = new f();
      if (Build.VERSION.SDK_INT >= 21) {}
      for (paramResources = paramResources.getDrawable(paramInt, paramTheme);; paramResources = paramResources.getDrawable(paramInt))
      {
        ((f)localObject).jJ = paramResources;
        ((f)localObject).jQ = new g(((f)localObject).jJ.getConstantState());
        return (f)localObject;
      }
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt != 2) {
        throw new XmlPullParserException("No start tag found");
      }
      paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      return paramResources;
    }
    catch (IOException paramResources) {}catch (XmlPullParserException paramResources) {}
    return null;
  }
  
  public static f a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = new f();
    localf.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localf;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = this.jL;
    e locale = localf.kH;
    int i = 1;
    Stack localStack = new Stack();
    localStack.push(e.a(locale));
    int j = paramXmlPullParser.getEventType();
    if (j != 1)
    {
      Object localObject;
      c localc;
      TypedArray localTypedArray;
      if (j == 2)
      {
        localObject = paramXmlPullParser.getName();
        localc = (c)localStack.peek();
        if ("path".equals(localObject))
        {
          localObject = new b();
          localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.js);
          ((b)localObject).a(localTypedArray, paramXmlPullParser);
          localTypedArray.recycle();
          localc.ki.add(localObject);
          if (((d)localObject).kr != null) {
            locale.kG.put(((d)localObject).kr, localObject);
          }
          i = 0;
          j = localf.jA;
          localf.jA = (((b)localObject).jA | j);
        }
      }
      for (;;)
      {
        j = paramXmlPullParser.next();
        break;
        if ("clip-path".equals(localObject))
        {
          localObject = new a();
          if (d.a(paramXmlPullParser, "pathData"))
          {
            localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.jt);
            ((a)localObject).a(localTypedArray);
            localTypedArray.recycle();
          }
          localc.ki.add(localObject);
          if (((d)localObject).kr != null) {
            locale.kG.put(((d)localObject).kr, localObject);
          }
          localf.jA |= ((a)localObject).jA;
        }
        else
        {
          if ("group".equals(localObject))
          {
            localObject = new c();
            localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.jr);
            ((c)localObject).jU = null;
            ((c)localObject).kj = d.a(localTypedArray, paramXmlPullParser, "rotation", 5, ((c)localObject).kj);
            ((c)localObject).kk = localTypedArray.getFloat(1, ((c)localObject).kk);
            ((c)localObject).kl = localTypedArray.getFloat(2, ((c)localObject).kl);
            ((c)localObject).mScaleX = d.a(localTypedArray, paramXmlPullParser, "scaleX", 3, ((c)localObject).mScaleX);
            ((c)localObject).mScaleY = d.a(localTypedArray, paramXmlPullParser, "scaleY", 4, ((c)localObject).mScaleY);
            ((c)localObject).km = d.a(localTypedArray, paramXmlPullParser, "translateX", 6, ((c)localObject).km);
            ((c)localObject).kn = d.a(localTypedArray, paramXmlPullParser, "translateY", 7, ((c)localObject).kn);
            String str = localTypedArray.getString(0);
            if (str != null) {
              ((c)localObject).kp = str;
            }
            ((c)localObject).ko.reset();
            ((c)localObject).ko.postTranslate(-((c)localObject).kk, -((c)localObject).kl);
            ((c)localObject).ko.postScale(((c)localObject).mScaleX, ((c)localObject).mScaleY);
            ((c)localObject).ko.postRotate(((c)localObject).kj, 0.0F, 0.0F);
            ((c)localObject).ko.postTranslate(((c)localObject).km + ((c)localObject).kk, ((c)localObject).kn + ((c)localObject).kl);
            localTypedArray.recycle();
            localc.ki.add(localObject);
            localStack.push(localObject);
            if (((c)localObject).kp != null) {
              locale.kG.put(((c)localObject).kp, localObject);
            }
            localf.jA |= ((c)localObject).jA;
          }
          continue;
          if ((j == 3) && ("group".equals(paramXmlPullParser.getName()))) {
            localStack.pop();
          }
        }
      }
    }
    if (i != 0)
    {
      paramResources = new StringBuffer();
      if (paramResources.length() > 0) {
        paramResources.append(" or ");
      }
      paramResources.append("path");
      throw new XmlPullParserException("no " + paramResources + " defined");
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (this.jJ != null) {
      android.support.v4.b.a.a.e(this.jJ);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.jJ != null) {
      this.jJ.draw(paramCanvas);
    }
    int i;
    int k;
    int m;
    do
    {
      do
      {
        return;
        copyBounds(this.jT);
      } while ((this.jT.width() <= 0) || (this.jT.height() <= 0));
      if (this.jN != null) {
        break;
      }
      localObject = this.jM;
      paramCanvas.getMatrix(this.jS);
      this.jS.getValues(this.jR);
      float f2 = Math.abs(this.jR[0]);
      float f1 = Math.abs(this.jR[4]);
      float f4 = Math.abs(this.jR[1]);
      float f3 = Math.abs(this.jR[3]);
      if ((f4 != 0.0F) || (f3 != 0.0F))
      {
        f1 = 1.0F;
        f2 = 1.0F;
      }
      j = (int)(this.jT.width() * f2);
      i = (int)(f1 * this.jT.height());
      k = Math.min(2048, j);
      m = Math.min(2048, i);
    } while ((k <= 0) || (m <= 0));
    int j = paramCanvas.save();
    paramCanvas.translate(this.jT.left, this.jT.top);
    this.jT.offsetTo(0, 0);
    f localf = this.jL;
    if (localf.kL != null)
    {
      if ((k != localf.kL.getWidth()) || (m != localf.kL.getHeight())) {
        break label386;
      }
      i = 1;
      label270:
      if (i != 0) {}
    }
    else
    {
      localf.kL = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
      localf.kQ = true;
    }
    label314:
    Rect localRect;
    if (!this.jP)
    {
      this.jL.j(k, m);
      localf = this.jL;
      localRect = this.jT;
      if (localf.kH.kE >= 255) {
        break label544;
      }
      i = 1;
      label343:
      if ((i != 0) || (localObject != null)) {
        break label550;
      }
    }
    for (Object localObject = null;; localObject = localf.kR)
    {
      paramCanvas.drawBitmap(localf.kL, null, localRect, (Paint)localObject);
      paramCanvas.restoreToCount(j);
      return;
      localObject = this.jN;
      break;
      label386:
      i = 0;
      break label270;
      localf = this.jL;
      if ((!localf.kQ) && (localf.kM == localf.kI) && (localf.kN == localf.kJ) && (localf.kP == localf.kK) && (localf.kO == localf.kH.kE)) {}
      for (i = 1;; i = 0)
      {
        if (i != 0) {
          break label542;
        }
        this.jL.j(k, m);
        localf = this.jL;
        localf.kM = localf.kI;
        localf.kN = localf.kJ;
        localf.kO = localf.kH.kE;
        localf.kP = localf.kK;
        localf.kQ = false;
        break;
      }
      label542:
      break label314;
      label544:
      i = 0;
      break label343;
      label550:
      if (localf.kR == null)
      {
        localf.kR = new Paint();
        localf.kR.setFilterBitmap(true);
      }
      localf.kR.setAlpha(localf.kH.kE);
      localf.kR.setColorFilter((ColorFilter)localObject);
    }
  }
  
  public final int getAlpha()
  {
    if (this.jJ != null) {
      return android.support.v4.b.a.a.d(this.jJ);
    }
    return this.jL.kH.kE;
  }
  
  public final int getChangingConfigurations()
  {
    if (this.jJ != null) {
      return this.jJ.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.jL.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (this.jJ != null) {
      return new g(this.jJ.getConstantState());
    }
    this.jL.jA = getChangingConfigurations();
    return this.jL;
  }
  
  public final int getIntrinsicHeight()
  {
    if (this.jJ != null) {
      return this.jJ.getIntrinsicHeight();
    }
    return (int)this.jL.kH.kB;
  }
  
  public final int getIntrinsicWidth()
  {
    if (this.jJ != null) {
      return this.jJ.getIntrinsicWidth();
    }
    return (int)this.jL.kH.kA;
  }
  
  public final int getOpacity()
  {
    if (this.jJ != null) {
      return this.jJ.getOpacity();
    }
    return -3;
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.jJ != null)
    {
      this.jJ.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    f localf1 = this.jL;
    localf1.kH = new e();
    TypedArray localTypedArray = a(paramResources, paramTheme, paramAttributeSet, a.jq);
    f localf2 = this.jL;
    e locale = localf2.kH;
    int i = d.a(localTypedArray, paramXmlPullParser, "tintMode", 6);
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    Object localObject = localMode;
    boolean bool;
    switch (i)
    {
    default: 
      localObject = localMode;
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
      localf2.kJ = ((PorterDuff.Mode)localObject);
      localObject = localTypedArray.getColorStateList(1);
      if (localObject != null) {
        localf2.kI = ((ColorStateList)localObject);
      }
      bool = localf2.kK;
      if (d.a(paramXmlPullParser, "autoMirrored")) {
        break;
      }
    }
    for (;;)
    {
      localf2.kK = bool;
      locale.kC = d.a(localTypedArray, paramXmlPullParser, "viewportWidth", 7, locale.kC);
      locale.kD = d.a(localTypedArray, paramXmlPullParser, "viewportHeight", 8, locale.kD);
      if (locale.kC > 0.0F) {
        break label356;
      }
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
      localObject = PorterDuff.Mode.SRC_OVER;
      break;
      localObject = PorterDuff.Mode.SRC_IN;
      break;
      localObject = PorterDuff.Mode.SRC_ATOP;
      break;
      localObject = PorterDuff.Mode.MULTIPLY;
      break;
      localObject = PorterDuff.Mode.SCREEN;
      break;
      localObject = PorterDuff.Mode.ADD;
      break;
      bool = localTypedArray.getBoolean(5, bool);
    }
    label356:
    if (locale.kD <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }
    locale.kA = localTypedArray.getDimension(3, locale.kA);
    locale.kB = localTypedArray.getDimension(2, locale.kB);
    if (locale.kA <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    }
    if (locale.kB <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    }
    locale.kE = ((int)(d.a(localTypedArray, paramXmlPullParser, "alpha", 4, locale.kE / 255.0F) * 255.0F));
    localObject = localTypedArray.getString(0);
    if (localObject != null)
    {
      locale.kF = ((String)localObject);
      locale.kG.put(localObject, locale);
    }
    localTypedArray.recycle();
    localf1.jA = getChangingConfigurations();
    localf1.kQ = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.jM = a(localf1.kI, localf1.kJ);
  }
  
  public final void invalidateSelf()
  {
    if (this.jJ != null)
    {
      this.jJ.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public final boolean isStateful()
  {
    if (this.jJ != null) {
      return this.jJ.isStateful();
    }
    return (super.isStateful()) || ((this.jL != null) && (this.jL.kI != null) && (this.jL.kI.isStateful()));
  }
  
  public final Drawable mutate()
  {
    if (this.jJ != null) {
      this.jJ.mutate();
    }
    while ((this.jO) || (super.mutate() != this)) {
      return this;
    }
    this.jL = new f(this.jL);
    this.jO = true;
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.jJ != null) {
      this.jJ.setBounds(paramRect);
    }
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.jJ != null) {
      return this.jJ.setState(paramArrayOfInt);
    }
    paramArrayOfInt = this.jL;
    if ((paramArrayOfInt.kI != null) && (paramArrayOfInt.kJ != null))
    {
      this.jM = a(paramArrayOfInt.kI, paramArrayOfInt.kJ);
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.jJ != null)
    {
      this.jJ.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.jJ != null) {
      this.jJ.setAlpha(paramInt);
    }
    while (this.jL.kH.kE == paramInt) {
      return;
    }
    this.jL.kH.kE = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.jJ != null)
    {
      this.jJ.setColorFilter(paramColorFilter);
      return;
    }
    this.jN = paramColorFilter;
    invalidateSelf();
  }
  
  public final void setTint(int paramInt)
  {
    if (this.jJ != null)
    {
      android.support.v4.b.a.a.a(this.jJ, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.jJ != null) {
      android.support.v4.b.a.a.a(this.jJ, paramColorStateList);
    }
    f localf;
    do
    {
      return;
      localf = this.jL;
    } while (localf.kI == paramColorStateList);
    localf.kI = paramColorStateList;
    this.jM = a(paramColorStateList, localf.kJ);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.jJ != null) {
      android.support.v4.b.a.a.a(this.jJ, paramMode);
    }
    f localf;
    do
    {
      return;
      localf = this.jL;
    } while (localf.kJ == paramMode);
    localf.kJ = paramMode;
    this.jM = a(localf.kI, paramMode);
    invalidateSelf();
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.jJ != null) {
      return this.jJ.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.jJ != null)
    {
      this.jJ.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  private static final class a
    extends f.d
  {
    public a() {}
    
    public a(a parama)
    {
      super();
    }
    
    final void a(TypedArray paramTypedArray)
    {
      String str = paramTypedArray.getString(0);
      if (str != null) {
        this.kr = str;
      }
      paramTypedArray = paramTypedArray.getString(1);
      if (paramTypedArray != null) {
        this.kq = c.z(paramTypedArray);
      }
    }
    
    public final boolean aU()
    {
      return true;
    }
  }
  
  private static final class b
    extends f.d
  {
    private int[] jU;
    int jV = 0;
    float jW = 0.0F;
    int jX = 0;
    float jY = 1.0F;
    int jZ;
    float ka = 1.0F;
    float kb = 0.0F;
    float kc = 1.0F;
    float kd = 0.0F;
    Paint.Cap ke = Paint.Cap.BUTT;
    Paint.Join kf = Paint.Join.MITER;
    float kg = 4.0F;
    
    public b() {}
    
    public b(b paramb)
    {
      super();
      this.jU = paramb.jU;
      this.jV = paramb.jV;
      this.jW = paramb.jW;
      this.jY = paramb.jY;
      this.jX = paramb.jX;
      this.jZ = paramb.jZ;
      this.ka = paramb.ka;
      this.kb = paramb.kb;
      this.kc = paramb.kc;
      this.kd = paramb.kd;
      this.ke = paramb.ke;
      this.kf = paramb.kf;
      this.kg = paramb.kg;
    }
    
    final void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      this.jU = null;
      if (!d.a(paramXmlPullParser, "pathData")) {
        return;
      }
      Object localObject = paramTypedArray.getString(0);
      if (localObject != null) {
        this.kr = ((String)localObject);
      }
      localObject = paramTypedArray.getString(2);
      if (localObject != null) {
        this.kq = c.z((String)localObject);
      }
      this.jX = d.a(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.jX);
      this.ka = d.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.ka);
      int i = d.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8);
      localObject = this.ke;
      switch (i)
      {
      default: 
        this.ke = ((Paint.Cap)localObject);
        i = d.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9);
        localObject = this.kf;
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        this.kf = ((Paint.Join)localObject);
        this.kg = d.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.kg);
        this.jV = d.a(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.jV);
        this.jY = d.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.jY);
        this.jW = d.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.jW);
        this.kc = d.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.kc);
        this.kd = d.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.kd);
        this.kb = d.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.kb);
        return;
        localObject = Paint.Cap.BUTT;
        break;
        localObject = Paint.Cap.ROUND;
        break;
        localObject = Paint.Cap.SQUARE;
        break;
        localObject = Paint.Join.MITER;
        continue;
        localObject = Paint.Join.ROUND;
        continue;
        localObject = Paint.Join.BEVEL;
      }
    }
  }
  
  private static final class c
  {
    int jA;
    int[] jU;
    final Matrix kh = new Matrix();
    final ArrayList<Object> ki = new ArrayList();
    float kj = 0.0F;
    float kk = 0.0F;
    float kl = 0.0F;
    float km = 0.0F;
    float kn = 0.0F;
    final Matrix ko = new Matrix();
    String kp = null;
    float mScaleX = 1.0F;
    float mScaleY = 1.0F;
    
    public c() {}
    
    public c(c paramc, android.support.v4.e.a<String, Object> parama)
    {
      this.kj = paramc.kj;
      this.kk = paramc.kk;
      this.kl = paramc.kl;
      this.mScaleX = paramc.mScaleX;
      this.mScaleY = paramc.mScaleY;
      this.km = paramc.km;
      this.kn = paramc.kn;
      this.jU = paramc.jU;
      this.kp = paramc.kp;
      this.jA = paramc.jA;
      if (this.kp != null) {
        parama.put(this.kp, this);
      }
      this.ko.set(paramc.ko);
      ArrayList localArrayList = paramc.ki;
      int i = 0;
      while (i < localArrayList.size())
      {
        paramc = localArrayList.get(i);
        if ((paramc instanceof c))
        {
          paramc = (c)paramc;
          this.ki.add(new c(paramc, parama));
          i += 1;
        }
        else
        {
          if ((paramc instanceof f.b)) {}
          for (paramc = new f.b((f.b)paramc);; paramc = new f.a((f.a)paramc))
          {
            this.ki.add(paramc);
            if (paramc.kr == null) {
              break;
            }
            parama.put(paramc.kr, paramc);
            break;
            if (!(paramc instanceof f.a)) {
              break label315;
            }
          }
          label315:
          throw new IllegalStateException("Unknown object in the tree!");
        }
      }
    }
  }
  
  private static class d
  {
    int jA;
    protected c.b[] kq = null;
    String kr;
    
    public d() {}
    
    public d(d paramd)
    {
      this.kr = paramd.kr;
      this.jA = paramd.jA;
      this.kq = c.a(paramd.kq);
    }
    
    public final void a(Path paramPath)
    {
      paramPath.reset();
      c.b[] arrayOfb;
      float[] arrayOfFloat1;
      int j;
      int k;
      float[] arrayOfFloat2;
      float f5;
      float f4;
      float f6;
      float f1;
      float f2;
      int m;
      float f7;
      float f8;
      label286:
      label478:
      float f9;
      if (this.kq != null)
      {
        arrayOfb = this.kq;
        arrayOfFloat1 = new float[6];
        j = 109;
        k = 0;
        if (k < arrayOfb.length)
        {
          int n = arrayOfb[k].jH;
          arrayOfFloat2 = arrayOfb[k].jI;
          f5 = arrayOfFloat1[0];
          f4 = arrayOfFloat1[1];
          f6 = arrayOfFloat1[2];
          f3 = arrayOfFloat1[3];
          f1 = arrayOfFloat1[4];
          f2 = arrayOfFloat1[5];
          int i;
          switch (n)
          {
          default: 
            i = 2;
            m = 0;
            f7 = f4;
            f4 = f5;
            f5 = f7;
            f8 = f6;
            if (m < arrayOfFloat2.length) {
              switch (n)
              {
              default: 
                f6 = f1;
                f1 = f3;
                f3 = f5;
                f5 = f4;
                f4 = f3;
                f3 = f6;
                f6 = f8;
              }
            }
            break;
          case 90: 
          case 122: 
          case 76: 
          case 77: 
          case 84: 
          case 108: 
          case 109: 
          case 116: 
          case 72: 
          case 86: 
          case 104: 
          case 118: 
          case 67: 
          case 99: 
          case 81: 
          case 83: 
          case 113: 
          case 115: 
          case 65: 
          case 97: 
            for (;;)
            {
              m += i;
              f7 = f3;
              f9 = f5;
              j = n;
              f8 = f6;
              f3 = f1;
              f1 = f7;
              f5 = f4;
              f4 = f9;
              break label286;
              paramPath.close();
              paramPath.moveTo(f1, f2);
              f3 = f2;
              f6 = f1;
              f4 = f2;
              f5 = f1;
              i = 2;
              break;
              i = 2;
              break;
              i = 1;
              break;
              i = 6;
              break;
              i = 4;
              break;
              i = 7;
              break;
              f4 += arrayOfFloat2[(m + 0)];
              f5 = arrayOfFloat2[(m + 1)] + f5;
              if (m > 0)
              {
                paramPath.rLineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                f7 = f1;
                f1 = f3;
                f9 = f4;
                f6 = f8;
                f3 = f7;
                f4 = f5;
                f5 = f9;
              }
              else
              {
                paramPath.rMoveTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                f2 = f5;
                f7 = f4;
                f1 = f3;
                f9 = f4;
                f6 = f8;
                f3 = f7;
                f4 = f5;
                f5 = f9;
                continue;
                f4 = arrayOfFloat2[(m + 0)];
                f5 = arrayOfFloat2[(m + 1)];
                if (m > 0)
                {
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f7 = f1;
                  f1 = f3;
                  f9 = f4;
                  f6 = f8;
                  f3 = f7;
                  f4 = f5;
                  f5 = f9;
                }
                else
                {
                  paramPath.moveTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f2 = f5;
                  f7 = f4;
                  f1 = f3;
                  f9 = f4;
                  f6 = f8;
                  f3 = f7;
                  f4 = f5;
                  f5 = f9;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f6 = arrayOfFloat2[(m + 0)];
                  f9 = arrayOfFloat2[(m + 1)];
                  f7 = f1;
                  f1 = f3;
                  f5 = f9 + f5;
                  f9 = f4 + f6;
                  f6 = f8;
                  f3 = f7;
                  f4 = f5;
                  f5 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f7 = arrayOfFloat2[(m + 0)];
                  f5 = arrayOfFloat2[(m + 1)];
                  f4 = f1;
                  f1 = f3;
                  f6 = f8;
                  f3 = f4;
                  f4 = f5;
                  f5 = f7;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(m + 0)], 0.0F);
                  f6 = arrayOfFloat2[(m + 0)];
                  f7 = f1;
                  f1 = f3;
                  f9 = f4 + f6;
                  f6 = f8;
                  f3 = f7;
                  f4 = f5;
                  f5 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], f5);
                  f7 = arrayOfFloat2[(m + 0)];
                  f4 = f1;
                  f1 = f3;
                  f6 = f8;
                  f3 = f4;
                  f4 = f5;
                  f5 = f7;
                  continue;
                  paramPath.rLineTo(0.0F, arrayOfFloat2[(m + 0)]);
                  f6 = arrayOfFloat2[(m + 0)];
                  f7 = f1;
                  f1 = f3;
                  f9 = f6 + f5;
                  f5 = f4;
                  f6 = f8;
                  f3 = f7;
                  f4 = f9;
                  continue;
                  paramPath.lineTo(f4, arrayOfFloat2[(m + 0)]);
                  f7 = arrayOfFloat2[(m + 0)];
                  f5 = f1;
                  f1 = f3;
                  f9 = f4;
                  f6 = f8;
                  f3 = f5;
                  f4 = f7;
                  f5 = f9;
                  continue;
                  paramPath.rCubicTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)], arrayOfFloat2[(m + 4)], arrayOfFloat2[(m + 5)]);
                  f6 = f4 + arrayOfFloat2[(m + 2)];
                  f9 = arrayOfFloat2[(m + 3)];
                  f7 = arrayOfFloat2[(m + 4)];
                  f8 = arrayOfFloat2[(m + 5)];
                  f3 = f1;
                  f1 = f5 + f9;
                  f5 = f8 + f5;
                  f7 = f4 + f7;
                  f4 = f5;
                  f5 = f7;
                  continue;
                  paramPath.cubicTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)], arrayOfFloat2[(m + 4)], arrayOfFloat2[(m + 5)]);
                  f5 = arrayOfFloat2[(m + 4)];
                  f4 = arrayOfFloat2[(m + 5)];
                  f6 = arrayOfFloat2[(m + 2)];
                  f7 = arrayOfFloat2[(m + 3)];
                  f3 = f1;
                  f1 = f7;
                  continue;
                  f6 = 0.0F;
                  f7 = 0.0F;
                  if ((j == 99) || (j == 115) || (j == 67) || (j == 83))
                  {
                    f6 = f4 - f8;
                    f7 = f5 - f3;
                  }
                  paramPath.rCubicTo(f6, f7, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
                  f6 = f4 + arrayOfFloat2[(m + 0)];
                  f9 = arrayOfFloat2[(m + 1)];
                  f7 = arrayOfFloat2[(m + 2)];
                  f8 = arrayOfFloat2[(m + 3)];
                  f3 = f1;
                  f1 = f5 + f9;
                  f5 = f8 + f5;
                  f7 = f4 + f7;
                  f4 = f5;
                  f5 = f7;
                }
              }
            }
            if ((j == 99) || (j == 115) || (j == 67) || (j == 83))
            {
              f4 = 2.0F * f4 - f8;
              f5 = 2.0F * f5 - f3;
            }
            break;
          }
        }
      }
      for (float f3 = f4;; f3 = f4)
      {
        paramPath.cubicTo(f3, f5, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
        f6 = arrayOfFloat2[(m + 0)];
        f7 = arrayOfFloat2[(m + 1)];
        f5 = arrayOfFloat2[(m + 2)];
        f4 = arrayOfFloat2[(m + 3)];
        f3 = f1;
        f1 = f7;
        break label478;
        paramPath.rQuadTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
        f6 = f4 + arrayOfFloat2[(m + 0)];
        f9 = arrayOfFloat2[(m + 1)];
        f7 = arrayOfFloat2[(m + 2)];
        f8 = arrayOfFloat2[(m + 3)];
        f3 = f1;
        f1 = f5 + f9;
        f5 = f8 + f5;
        f7 = f4 + f7;
        f4 = f5;
        f5 = f7;
        break label478;
        paramPath.quadTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
        f6 = arrayOfFloat2[(m + 0)];
        f7 = arrayOfFloat2[(m + 1)];
        f5 = arrayOfFloat2[(m + 2)];
        f4 = arrayOfFloat2[(m + 3)];
        f3 = f1;
        f1 = f7;
        break label478;
        f7 = 0.0F;
        f6 = 0.0F;
        if ((j == 113) || (j == 116) || (j == 81) || (j == 84))
        {
          f7 = f4 - f8;
          f6 = f5 - f3;
        }
        paramPath.rQuadTo(f7, f6, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
        f7 = f4 + f7;
        f8 = arrayOfFloat2[(m + 0)];
        f9 = arrayOfFloat2[(m + 1)];
        f3 = f1;
        f1 = f5 + f6;
        f5 = f9 + f5;
        f8 = f4 + f8;
        f6 = f7;
        f4 = f5;
        f5 = f8;
        break label478;
        if ((j != 113) && (j != 116) && (j != 81))
        {
          f7 = f5;
          f6 = f4;
          if (j != 84) {}
        }
        else
        {
          f6 = 2.0F * f4 - f8;
          f7 = 2.0F * f5 - f3;
        }
        paramPath.quadTo(f6, f7, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
        f5 = arrayOfFloat2[(m + 0)];
        f4 = arrayOfFloat2[(m + 1)];
        f3 = f1;
        f1 = f7;
        break label478;
        f3 = arrayOfFloat2[(m + 5)];
        f6 = arrayOfFloat2[(m + 6)];
        f7 = arrayOfFloat2[(m + 0)];
        f8 = arrayOfFloat2[(m + 1)];
        f9 = arrayOfFloat2[(m + 2)];
        boolean bool1;
        if (arrayOfFloat2[(m + 3)] != 0.0F)
        {
          bool1 = true;
          label2143:
          if (arrayOfFloat2[(m + 4)] == 0.0F) {
            break label2238;
          }
        }
        label2238:
        for (boolean bool2 = true;; bool2 = false)
        {
          c.b.a(paramPath, f4, f5, f3 + f4, f6 + f5, f7, f8, f9, bool1, bool2);
          f6 = f4 + arrayOfFloat2[(m + 5)];
          f4 = f5 + arrayOfFloat2[(m + 6)];
          f3 = f1;
          f1 = f4;
          f7 = f6;
          f5 = f6;
          f6 = f7;
          break;
          bool1 = false;
          break label2143;
        }
        f3 = arrayOfFloat2[(m + 5)];
        f6 = arrayOfFloat2[(m + 6)];
        f7 = arrayOfFloat2[(m + 0)];
        f8 = arrayOfFloat2[(m + 1)];
        f9 = arrayOfFloat2[(m + 2)];
        if (arrayOfFloat2[(m + 3)] != 0.0F)
        {
          bool1 = true;
          label2305:
          if (arrayOfFloat2[(m + 4)] == 0.0F) {
            break label2380;
          }
        }
        label2380:
        for (bool2 = true;; bool2 = false)
        {
          c.b.a(paramPath, f4, f5, f3, f6, f7, f8, f9, bool1, bool2);
          f5 = arrayOfFloat2[(m + 5)];
          f4 = arrayOfFloat2[(m + 6)];
          f3 = f1;
          f1 = f4;
          f6 = f5;
          break;
          bool1 = false;
          break label2305;
        }
        arrayOfFloat1[0] = f4;
        arrayOfFloat1[1] = f5;
        arrayOfFloat1[2] = f8;
        arrayOfFloat1[3] = f3;
        arrayOfFloat1[4] = f1;
        arrayOfFloat1[5] = f2;
        j = arrayOfb[k].jH;
        k += 1;
        break;
        return;
      }
    }
    
    public boolean aU()
    {
      return false;
    }
  }
  
  private static final class e
  {
    private static final Matrix ku = new Matrix();
    private int jA;
    float kA = 0.0F;
    float kB = 0.0F;
    float kC = 0.0F;
    float kD = 0.0F;
    int kE = 255;
    String kF = null;
    final android.support.v4.e.a<String, Object> kG = new android.support.v4.e.a();
    private final Path ks;
    private final Path kt;
    private final Matrix kv = new Matrix();
    private Paint kw;
    private Paint kx;
    private PathMeasure ky;
    private final f.c kz;
    
    public e()
    {
      this.kz = new f.c();
      this.ks = new Path();
      this.kt = new Path();
    }
    
    public e(e parame)
    {
      this.kz = new f.c(parame.kz, this.kG);
      this.ks = new Path(parame.ks);
      this.kt = new Path(parame.kt);
      this.kA = parame.kA;
      this.kB = parame.kB;
      this.kC = parame.kC;
      this.kD = parame.kD;
      this.jA = parame.jA;
      this.kE = parame.kE;
      this.kF = parame.kF;
      if (parame.kF != null) {
        this.kG.put(parame.kF, this);
      }
    }
    
    private void a(f.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      paramc.kh.set(paramMatrix);
      paramc.kh.preConcat(paramc.ko);
      int i = 0;
      if (i < paramc.ki.size())
      {
        paramMatrix = paramc.ki.get(i);
        if ((paramMatrix instanceof f.c)) {
          a((f.c)paramMatrix, paramc.kh, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
        float f1;
        float f3;
        float f2;
        Object localObject;
        float f7;
        float f4;
        float f5;
        float f6;
        for (;;)
        {
          i += 1;
          break;
          if ((paramMatrix instanceof f.d))
          {
            paramMatrix = (f.d)paramMatrix;
            f1 = paramInt1 / this.kC;
            f3 = paramInt2 / this.kD;
            f2 = Math.min(f1, f3);
            localObject = paramc.kh;
            this.kv.set((Matrix)localObject);
            this.kv.postScale(f1, f3);
            float[] arrayOfFloat = new float[4];
            float[] tmp155_153 = arrayOfFloat;
            tmp155_153[0] = 0.0F;
            float[] tmp159_155 = tmp155_153;
            tmp159_155[1] = 1.0F;
            float[] tmp163_159 = tmp159_155;
            tmp163_159[2] = 1.0F;
            float[] tmp167_163 = tmp163_159;
            tmp167_163[3] = 0.0F;
            tmp167_163;
            ((Matrix)localObject).mapVectors(arrayOfFloat);
            f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
            f7 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
            f3 = arrayOfFloat[0];
            f4 = arrayOfFloat[1];
            f5 = arrayOfFloat[2];
            f6 = arrayOfFloat[3];
            f7 = Math.max(f1, f7);
            f1 = 0.0F;
            if (f7 > 0.0F) {
              f1 = Math.abs(f6 * f3 - f4 * f5) / f7;
            }
            if (f1 != 0.0F)
            {
              paramMatrix.a(this.ks);
              localObject = this.ks;
              this.kt.reset();
              if (!paramMatrix.aU()) {
                break label336;
              }
              this.kt.addPath((Path)localObject, this.kv);
              paramCanvas.clipPath(this.kt, Region.Op.REPLACE);
            }
          }
        }
        label336:
        paramMatrix = (f.b)paramMatrix;
        if ((paramMatrix.kb != 0.0F) || (paramMatrix.kc != 1.0F))
        {
          f6 = paramMatrix.kb;
          f7 = paramMatrix.kd;
          f4 = paramMatrix.kc;
          f5 = paramMatrix.kd;
          if (this.ky == null) {
            this.ky = new PathMeasure();
          }
          this.ky.setPath(this.ks, false);
          f3 = this.ky.getLength();
          f6 = (f6 + f7) % 1.0F * f3;
          f4 = (f4 + f5) % 1.0F * f3;
          ((Path)localObject).reset();
          if (f6 <= f4) {
            break label733;
          }
          this.ky.getSegment(f6, f3, (Path)localObject, true);
          this.ky.getSegment(0.0F, f4, (Path)localObject, true);
        }
        for (;;)
        {
          ((Path)localObject).rLineTo(0.0F, 0.0F);
          this.kt.addPath((Path)localObject, this.kv);
          if (paramMatrix.jX != 0)
          {
            if (this.kx == null)
            {
              this.kx = new Paint();
              this.kx.setStyle(Paint.Style.FILL);
              this.kx.setAntiAlias(true);
            }
            localObject = this.kx;
            ((Paint)localObject).setColor(f.c(paramMatrix.jX, paramMatrix.ka));
            ((Paint)localObject).setColorFilter(paramColorFilter);
            paramCanvas.drawPath(this.kt, (Paint)localObject);
          }
          if (paramMatrix.jV == 0) {
            break;
          }
          if (this.kw == null)
          {
            this.kw = new Paint();
            this.kw.setStyle(Paint.Style.STROKE);
            this.kw.setAntiAlias(true);
          }
          localObject = this.kw;
          if (paramMatrix.kf != null) {
            ((Paint)localObject).setStrokeJoin(paramMatrix.kf);
          }
          if (paramMatrix.ke != null) {
            ((Paint)localObject).setStrokeCap(paramMatrix.ke);
          }
          ((Paint)localObject).setStrokeMiter(paramMatrix.kg);
          ((Paint)localObject).setColor(f.c(paramMatrix.jV, paramMatrix.jY));
          ((Paint)localObject).setColorFilter(paramColorFilter);
          ((Paint)localObject).setStrokeWidth(f1 * f2 * paramMatrix.jW);
          paramCanvas.drawPath(this.kt, (Paint)localObject);
          break;
          label733:
          this.ky.getSegment(f6, f4, (Path)localObject, true);
        }
      }
    }
    
    public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
    {
      a(this.kz, ku, paramCanvas, paramInt1, paramInt2, null);
    }
  }
  
  private static final class f
    extends Drawable.ConstantState
  {
    int jA;
    f.e kH;
    ColorStateList kI = null;
    PorterDuff.Mode kJ = f.jK;
    boolean kK;
    Bitmap kL;
    ColorStateList kM;
    PorterDuff.Mode kN;
    int kO;
    boolean kP;
    boolean kQ;
    Paint kR;
    
    public f()
    {
      this.kH = new f.e();
    }
    
    public f(f paramf)
    {
      if (paramf != null)
      {
        this.jA = paramf.jA;
        this.kH = new f.e(paramf.kH);
        if (f.e.b(paramf.kH) != null) {
          f.e.a(this.kH, new Paint(f.e.b(paramf.kH)));
        }
        if (f.e.c(paramf.kH) != null) {
          f.e.b(this.kH, new Paint(f.e.c(paramf.kH)));
        }
        this.kI = paramf.kI;
        this.kJ = paramf.kJ;
        this.kK = paramf.kK;
      }
    }
    
    public final int getChangingConfigurations()
    {
      return this.jA;
    }
    
    public final void j(int paramInt1, int paramInt2)
    {
      this.kL.eraseColor(0);
      Canvas localCanvas = new Canvas(this.kL);
      this.kH.a(localCanvas, paramInt1, paramInt2);
    }
    
    public final Drawable newDrawable()
    {
      return new f(this, (byte)0);
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new f(this, (byte)0);
    }
  }
  
  private static final class g
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState jE;
    
    public g(Drawable.ConstantState paramConstantState)
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
      f localf = new f((byte)0);
      localf.jJ = ((VectorDrawable)this.jE.newDrawable());
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      f localf = new f((byte)0);
      localf.jJ = ((VectorDrawable)this.jE.newDrawable(paramResources));
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      f localf = new f((byte)0);
      localf.jJ = ((VectorDrawable)this.jE.newDrawable(paramResources, paramTheme));
      return localf;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */