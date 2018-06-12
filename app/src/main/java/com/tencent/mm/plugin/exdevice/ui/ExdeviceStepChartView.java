package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceStepChartView
  extends View
{
  Paint fBa;
  private final float iGA = 22.0F;
  private final int iGB = (int)i(1, 22.0F);
  private final float iGC = 67.0F;
  private final int iGD = (int)i(1, 67.0F);
  private final float iGE = 40.0F;
  private final int iGF = (int)i(1, 40.0F);
  private final float iGG = 22.0F;
  private final int iGH = (int)i(1, 22.0F);
  private final float iGI = 55.0F;
  private final int iGJ = (int)i(1, 55.0F);
  private final float iGK = 35.0F;
  private final int iGL = (int)i(1, 35.0F);
  private final float iGM = 45.0F;
  private final int iGN = (int)i(1, 45.0F);
  private final float iGO = 8.0F;
  private final float iGP = (int)i(1, 8.0F);
  private final float iGQ = 8.0F;
  private final float iGR = (int)i(1, 8.0F);
  private final int iGS = 2;
  private final int iGT = (int)i(1, 2.0F);
  private final int iGU = 15;
  private final int iGV = (int)i(1, 15.0F);
  private final float iGW = 33.0F;
  private final int iGX = (int)i(1, 33.0F);
  private final float iGY = 8.0F;
  private final int iGZ = (int)i(1, 8.0F);
  private final int iGa = -1;
  private final int iGb = -1;
  private final int iGc = getResources().getColor(R.e.exdevice_step_chart_background_line_color);
  private final float iGd = 12.0F;
  private final float iGe = 28.0F;
  private final float iGf = 33.0F;
  private final float iGg = 12.0F;
  private final float iGh = 12.0F;
  private final int iGi = getResources().getColor(R.e.exdevice_step_chart_date_text_color);
  private final int iGj = -1;
  private final int iGk = getResources().getColor(R.e.exdevice_step_chart_date_text_color);
  private final int iGl = -1;
  private int iGm = Integer.MAX_VALUE;
  private int iGn = 0;
  private int iGo = 0;
  private final float iGp = 10.0F;
  private final float iGq = 2.5F;
  private final int iGr = (int)i(1, 2.5F);
  private final float iGs = 4.0F;
  private final int iGt = (int)i(1, 4.0F);
  private final float iGu = 1.8F;
  private final int iGv = (int)i(1, 1.8F);
  private final float iGw = 1.0F;
  private final int iGx = (int)i(1, 1.0F);
  private final float iGy = 8.0F;
  private final int iGz = (int)i(1, 8.0F);
  List<String> iHA;
  private boolean iHB = false;
  PathEffect iHC = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
  private int iHD;
  private boolean iHE;
  private final float iHa = 35.0F;
  private final int iHb = (int)i(1, 35.0F);
  private final float iHc = 10.0F;
  private final int iHd = (int)i(1, 10.0F);
  private final float iHe = 58.0F;
  private final int iHf = (int)i(1, 58.0F);
  private final int iHg = (int)i(1, 1.0F);
  private final int iHh = 102;
  private final int iHi = 102;
  private final int iHj = 153;
  private final int iHk = 102;
  private final int iHl = 102;
  private final int iHm = 102;
  private final int iHn = 204;
  private int iHo = 0;
  private final Typeface iHp = Typeface.create(Typeface.DEFAULT_BOLD, 0);
  private final Typeface iHq = Typeface.create(Typeface.DEFAULT_BOLD, 1);
  private int iHr = 0;
  private int iHs = 0;
  private int[] iHt = { 0, 0, 0, 0, 0, 0, 0 };
  private final int iHu = 7;
  private float[] iHv = new float[7];
  private float[] iHw = new float[7];
  private boolean[] iHx = new boolean[7];
  Path iHy;
  Path iHz;
  List<Point> points;
  private int startY;
  
  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    aIn();
  }
  
  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    aIn();
  }
  
  private void aIn()
  {
    this.fBa = new Paint();
    this.iHy = new Path();
    this.iHz = new Path();
    this.points = new LinkedList();
    this.iHA = new LinkedList();
    aIo();
  }
  
  private void aIo()
  {
    int i = 0;
    if (i < 7)
    {
      if (i == 6) {
        this.iHx[i] = true;
      }
      for (;;)
      {
        i += 1;
        break;
        this.iHx[i] = false;
      }
    }
  }
  
  private void aIp()
  {
    this.fBa.reset();
    this.fBa.setAntiAlias(true);
    this.fBa.setStrokeWidth(this.iGv);
    this.fBa.setStyle(Paint.Style.STROKE);
    this.fBa.setColor(-1);
  }
  
  private int ai(float paramFloat)
  {
    this.iGm = Integer.MAX_VALUE;
    int i;
    if (this.points.size() > 0) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.points.size())
      {
        if (i != 0) {
          break label86;
        }
        if ((paramFloat >= ((Point)this.points.get(i)).x + this.iHr / 2) || (paramFloat <= 0.0F)) {
          break label250;
        }
        this.iGm = i;
        invalidate();
      }
      for (;;)
      {
        return this.iGm;
        label86:
        if ((i > 0) && (i < this.points.size() - 1))
        {
          if ((paramFloat >= ((Point)this.points.get(i)).x + this.iHr / 2) || (paramFloat <= ((Point)this.points.get(i)).x - this.iHr / 2)) {
            break;
          }
          this.iGm = i;
          invalidate();
        }
        else if (i == this.points.size() - 1)
        {
          if ((paramFloat >= this.iGn) || (paramFloat <= ((Point)this.points.get(i)).x - this.iHr / 2)) {
            break;
          }
          this.iGm = i;
          invalidate();
        }
        else
        {
          this.iGm = Integer.MAX_VALUE;
        }
      }
      label250:
      i += 1;
    }
  }
  
  private void b(Canvas paramCanvas, List<String> paramList)
  {
    if ((paramList != null) && (paramList.size() == 7))
    {
      this.fBa.reset();
      this.fBa.setAntiAlias(true);
      this.fBa.setStrokeWidth(0.0F);
      this.fBa.setTextSize(i(2, 12.0F));
      this.fBa.setAlpha(153);
      int i = 0;
      if (i < paramList.size())
      {
        if (i == 0)
        {
          this.fBa.setTextAlign(Paint.Align.LEFT);
          label88:
          if (this.iHx[i] == 0) {
            break label170;
          }
          this.fBa.setColor(-1);
        }
        for (;;)
        {
          paramCanvas.drawText((String)paramList.get(i), ((Point)this.points.get(i)).x, this.iGo - this.iGV, this.fBa);
          i += 1;
          break;
          this.fBa.setTextAlign(Paint.Align.CENTER);
          break label88;
          label170:
          this.fBa.setColor(this.iGi);
        }
      }
    }
  }
  
  private void c(Canvas paramCanvas, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.iHz.reset();
      this.iHz.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
      i = 0;
      while (i < this.points.size())
      {
        this.iHz.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
        i += 1;
      }
      this.iHz.lineTo(this.iHv[(this.iHv.length - 1)], this.iGo - this.iGL - 1);
      this.iHz.lineTo(this.iGz, this.iGo - this.iGL - 1);
      this.iHz.lineTo(this.iGz, this.iHw[0]);
      paramCanvas.drawPath(this.iHz, this.fBa);
      return;
    }
    this.iHz.reset();
    this.iHz.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
    label251:
    if (i < this.points.size())
    {
      if (i <= 0) {
        break label493;
      }
      if (((Point)this.points.get(i - 1)).y != this.iGo - this.iGF) {
        break label486;
      }
      this.fBa.reset();
      DashPathEffect localDashPathEffect = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
      this.fBa.setPathEffect(localDashPathEffect);
      this.fBa.setAntiAlias(true);
      this.fBa.setStrokeWidth(this.iGv);
      this.fBa.setStyle(Paint.Style.STROKE);
      this.fBa.setColor(-1);
    }
    for (;;)
    {
      this.iHz.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
      paramCanvas.drawPath(this.iHz, this.fBa);
      this.iHz.reset();
      this.iHz.moveTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
      i += 1;
      break label251;
      break;
      label486:
      aIp();
      continue;
      label493:
      aIp();
    }
  }
  
  private void getData()
  {
    int n = 0;
    this.points.clear();
    View localView = findViewById(R.h.exdevice_rank_step_chart);
    this.iGn = localView.getWidth();
    this.iGo = localView.getHeight();
    this.iHr = ((this.iGn - this.iGz - this.iGB) / 6);
    this.iHs = ((this.iGo - this.iGD - this.iGF) / 2);
    int i = 0;
    while (i < this.iHv.length)
    {
      this.iHv[i] = (this.iGz + this.iHr * i);
      i += 1;
    }
    i = this.iHt.length;
    int k = i;
    if (i > 7) {
      k = 7;
    }
    i = 0;
    int m;
    for (int j = 0; i < k; j = m)
    {
      if (this.iHt[i] > 100000) {
        this.iHt[i] = 100000;
      }
      if (this.iHt[i] < 0) {
        this.iHt[i] = 0;
      }
      m = j;
      if (this.iHt[i] > j) {
        m = this.iHt[i];
      }
      i += 1;
    }
    if ((j <= 15000) && (j >= 0)) {
      i = 15000;
    }
    for (;;)
    {
      this.iHo = ((this.iGo - this.iGD - this.iGF) * 10000 / i);
      this.iHo = (this.iGo - this.iGF - this.iHo);
      j = n;
      for (;;)
      {
        if (j < k)
        {
          this.iHw[j] = (this.iGo - this.iGF - this.iHt[j] / i * (this.iGo - this.iGD - this.iGF));
          this.points.add(new Point((int)this.iHv[j], (int)this.iHw[j]));
          j += 1;
          continue;
          if ((j <= 15000) || (j > 100000)) {
            break label405;
          }
          i = j;
          if (j / 5000.0D <= j / 5000.0F) {
            break;
          }
          i = (j / 5000 + 1) * 5000;
          break;
        }
      }
      return;
      label405:
      i = 0;
    }
  }
  
  private float i(int paramInt, float paramFloat)
  {
    Object localObject = getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources()) {
      return TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    getData();
    super.onDraw(paramCanvas);
    int i;
    Object localObject;
    float f;
    if (!this.iHB)
    {
      this.fBa.reset();
      this.fBa.setAntiAlias(true);
      this.fBa.setColor(-1);
      this.fBa.setStrokeWidth(0.0F);
      this.fBa.setStyle(Paint.Style.FILL);
      i = 0;
      if (i < this.points.size())
      {
        localObject = (Point)this.points.get(i);
        if (i == this.points.size() - 1) {
          paramCanvas.drawCircle(((Point)localObject).x, ((Point)localObject).y, this.iGt, this.fBa);
        }
        for (;;)
        {
          i += 1;
          break;
          paramCanvas.drawCircle(((Point)localObject).x, ((Point)localObject).y, this.iGr, this.fBa);
        }
      }
      if (this.iGm != Integer.MAX_VALUE)
      {
        i = this.iGm;
        this.fBa.reset();
        this.fBa.setColor(this.iGi);
        this.fBa.setAntiAlias(true);
        this.fBa.setStrokeWidth(0.0F);
        this.fBa.setTextSize(i(2, 12.0F));
        this.fBa.setTextAlign(Paint.Align.CENTER);
        if ((i >= 0) && (i <= 6))
        {
          if (i == 0) {
            this.fBa.setTextAlign(Paint.Align.LEFT);
          }
          if (i == 6) {
            this.fBa.setTextAlign(Paint.Align.RIGHT);
          }
          if (!this.iHE)
          {
            this.iHD = (((Point)this.points.get(i)).y - this.iHf);
            this.startY = this.iHD;
            this.iHE = true;
          }
          if (this.iHE)
          {
            f = (float)(this.startY / 8.0D);
            if (this.iHD > 0) {
              this.fBa.setAlpha((this.startY - this.iHD) * 255 / this.startY);
            }
            paramCanvas.drawText(this.iHt[i], ((Point)this.points.get(i)).x, this.iHD + this.iHf, this.fBa);
            if (this.iHD <= 0) {
              break label1241;
            }
            if (this.iHD / this.startY > 1.0F / f) {
              break label1214;
            }
            this.iHD -= 1;
            invalidate();
          }
        }
      }
    }
    for (;;)
    {
      i = this.iGm;
      if ((i >= 0) && (i <= 6)) {
        this.iHx[i] = true;
      }
      this.fBa.reset();
      this.iHy.reset();
      localObject = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
      this.fBa.setPathEffect((PathEffect)localObject);
      this.fBa.setColor(this.iGc);
      this.fBa.setStrokeWidth(this.iGx);
      this.fBa.setAlpha(102);
      this.fBa.setStyle(Paint.Style.STROKE);
      if ((this.iHo != 0) && (!this.iHB))
      {
        this.iHy.moveTo(this.iGz, this.iHo);
        this.iHy.lineTo(this.iGn - this.iGH, this.iHo);
        paramCanvas.drawPath(this.iHy, this.fBa);
      }
      this.fBa.reset();
      this.iHy.reset();
      this.fBa.setColor(this.iGc);
      this.fBa.setStrokeWidth(this.iGx);
      this.fBa.setStyle(Paint.Style.STROKE);
      this.fBa.setAlpha(102);
      this.iHy.reset();
      this.iHy.moveTo(this.iGP, this.iGo - this.iGL);
      this.iHy.lineTo(this.iGn - this.iGR, this.iGo - this.iGL);
      this.iHy.moveTo(this.iGP, this.iGN);
      this.iHy.lineTo(this.iGn - this.iGR, this.iGN);
      paramCanvas.drawPath(this.iHy, this.fBa);
      if (!this.iHB)
      {
        this.fBa.reset();
        this.fBa.setColor(this.iGk);
        this.fBa.setAntiAlias(true);
        this.fBa.setAlpha(102);
        this.fBa.setStrokeWidth(0.0F);
        this.fBa.setTextSize(i(2, 12.0F));
        this.fBa.setTextAlign(Paint.Align.RIGHT);
        paramCanvas.drawText(getResources().getString(R.l.exdevice_profile_step_chart_1w_tips), this.iGn - this.iGT, (float)(this.iHo + this.fBa.getTextSize() * 0.34D), this.fBa);
      }
      this.fBa.reset();
      this.fBa.setColor(-1);
      this.fBa.setAntiAlias(true);
      this.fBa.setStrokeWidth(0.0F);
      this.fBa.setTypeface(this.iHp);
      this.fBa.setTextSize(i(2, 28.0F));
      paramCanvas.drawText(getResources().getString(R.l.exdevice_profile_step_chart_step_tips), this.iGZ, this.iGX, this.fBa);
      this.fBa.setTextAlign(Paint.Align.RIGHT);
      this.fBa.setTextSize(i(2, 33.0F));
      paramCanvas.drawText(this.iHt[(this.iHt.length - 1)], this.iGn - this.iHd, this.iHb, this.fBa);
      if (this.points.size() > 2)
      {
        this.fBa.reset();
        this.fBa.setAntiAlias(true);
        this.fBa.setStrokeWidth(0.0F);
        this.fBa.setAlpha(102);
        this.fBa.setStyle(Paint.Style.FILL_AND_STROKE);
        localObject = new LinearGradient(0.0F, 0.0F, 0.0F, this.iGo - this.iGL, -1, 16777215, Shader.TileMode.REPEAT);
        this.fBa.setShader((Shader)localObject);
        this.fBa.setColor(-1);
        c(paramCanvas, true);
        aIp();
        if (!this.iHB) {
          c(paramCanvas, false);
        }
      }
      b(paramCanvas, this.iHA);
      return;
      label1214:
      this.iHD = ((int)(this.iHD - this.iHD / this.startY * f));
      break;
      label1241:
      this.iHE = false;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f = paramMotionEvent.getX();
    paramMotionEvent.getY();
    x.i("MicroMsg.exdevice.ExdeviceStepChartView", "mOnTouchLinePsition:" + this.iGm);
    switch (paramMotionEvent.getAction())
    {
    default: 
      x.d("MicroMsg.exdevice.ExdeviceStepChartView", "default");
      return false;
    case 0: 
      x.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_DOWN");
      return true;
    }
    x.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_UP");
    this.iGm = ai(f);
    aIo();
    this.iHE = false;
    invalidate();
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceStepChartView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */