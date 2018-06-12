package com.tencent.mm.plugin.sport.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class k
  implements SensorEventListener
{
  private static long opc = 0L;
  private static long opd = 0L;
  private static long ope = 0L;
  private static long opf = 0L;
  private static long opg = 0L;
  private static long oph = 0L;
  private static long opi = 0L;
  private static long opj = 0L;
  public c opk;
  
  public k()
  {
    opg = 0L;
    oph = 0L;
    opi = 0L;
    opj = 0L;
    opc = 0L;
    opd = 0L;
    ope = 0L;
    opf = 0L;
  }
  
  public static long bFO()
  {
    return ope;
  }
  
  public static long bFP()
  {
    return opg;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    JSONObject localJSONObject = g.bFJ();
    if (localJSONObject.optInt("deviceStepSwitch") != 1)
    {
      if (this.opk != null) {
        this.opk.bFH();
      }
      x.i("MicroMsg.Sport.SportStepDetector", "device step switch off");
    }
    int j;
    do
    {
      return;
      j = localJSONObject.optInt("stepCounterMaxStep5m", 3000);
      if ((paramSensorEvent == null) || (paramSensorEvent.values == null) || (paramSensorEvent.values.length <= 0)) {
        break;
      }
      x.i("MicroMsg.Sport.SportStepDetector", "Step change %f, accuracy %s, %s", new Object[] { Float.valueOf(paramSensorEvent.values[0]), Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
      l1 = bi.ciZ() / 10000L;
      if (opg == 0L) {
        opg = i.xS(202);
      }
      if (opd == 0L) {
        opd = i.xS(203);
      }
      if (ope == 0L) {
        ope = i.xS(201);
      }
      if (opf == 0L) {
        opf = ope;
      }
      if (oph == 0L) {
        oph = i.xS(204);
      }
      if (opi == 0L) {
        opi = oph;
      }
      if (opj == 0L) {
        opj = i.xS(209);
      }
      x.i("MicroMsg.Sport.SportStepDetector", "currentVar: beginOfToday %d saveTodayTime %d preSensorStep %d currentTodayStep %d lastSaveSensorStep %d lastSaveStepTime %d preSysStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(l1), Long.valueOf(opg), Long.valueOf(opd), Long.valueOf(ope), Long.valueOf(opf), Long.valueOf(oph), Long.valueOf(opi), Long.valueOf(opj) });
      l2 = paramSensorEvent.values[0];
      opc = l2;
    } while (l2 < 0L);
    long l4 = System.currentTimeMillis();
    long l5 = paramSensorEvent.timestamp;
    if (opg != l1)
    {
      x.i("MicroMsg.Sport.SportStepDetector", "new day beginOfToday: %s saveTodayTime: %s, ", new Object[] { n.bx(10000L * l1), n.bx(opg * 10000L) });
      i.N(202, l1);
      i.N(201, 0L);
      i.N(204, l4);
      i.N(209, paramSensorEvent.timestamp);
      i.N(203, (int)opc);
      opd = opc;
      ope = 0L;
      opf = 0L;
      opg = l1;
      oph = l4;
      opi = l4;
      opj = l5;
      return;
    }
    long l2 = i.xS(205);
    long l1 = 0L;
    long l3 = (l4 - opi) / 300000L;
    int i;
    long l6;
    label568:
    long l7;
    boolean bool1;
    if ((l4 - opi) % 300000L > 0L)
    {
      i = 1;
      l6 = l3 + i;
      l3 = (l5 / 1000000L - opj / 1000000L) / 300000L;
      if ((l5 / 1000000L - opj / 1000000L) % 300000L <= 0L) {
        break label956;
      }
      i = 1;
      l7 = l3 + i;
      x.i("MicroMsg.Sport.SportStepDetector", "timesOf5Minute(%d, %d). rebootTime: %d %s", new Object[] { Long.valueOf(l7), Long.valueOf(l6), Long.valueOf(l2), n.bx(l2) });
      bool1 = false;
      paramSensorEvent = "";
      if (l2 <= oph) {
        break label961;
      }
      l3 = opc - opf;
      if ((l3 <= 0L) || ((l3 >= j * l7) && (l3 >= j * l6))) {
        break label1283;
      }
      paramSensorEvent = "rebootIncrease Valid Step diffStep > 0";
    }
    label749:
    label956:
    label961:
    label1183:
    label1277:
    label1283:
    for (l1 = l3;; l1 = 0L)
    {
      l2 = l1;
      Object localObject = paramSensorEvent;
      if (l3 < 0L) {
        if (opc >= j * l7)
        {
          l2 = l1;
          localObject = paramSensorEvent;
          if (opc >= j * l6) {}
        }
        else
        {
          l2 = opc;
          localObject = "rebootIncrease Valid Step diffStep < 0";
        }
      }
      i.N(205, 0L);
      l1 = l2;
      paramSensorEvent = (SensorEvent)localObject;
      bool1 = true;
      for (;;)
      {
        x.i("MicroMsg.Sport.SportStepDetector", "increase step %s %d %b", new Object[] { paramSensorEvent, Long.valueOf(l1), Boolean.valueOf(bool1) });
        ope += l1;
        if ((l4 - oph > localJSONObject.optInt("stepCounterSaveInterval", 60000)) || (opc - opf > localJSONObject.optInt("stepCounterSaveStep")) || (bool1))
        {
          i.N(201, ope);
          i.N(203, opc);
          i.N(204, l4);
          i.N(209, l5);
          x.i("MicroMsg.Sport.SportStepDetector", "save to [file] currentTodayStep %d lastSaveSensorStep %d preSysStepTime %d lastSaveStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(ope), Long.valueOf(opf), Long.valueOf(opi), Long.valueOf(oph), Long.valueOf(opj) });
          oph = l4;
          opf = opc;
        }
        for (;;)
        {
          opd = opc;
          opi = l4;
          opj = l5;
          return;
          i = 0;
          break;
          i = 0;
          break label568;
          if (opc < opd)
          {
            x.i("MicroMsg.Sport.SportStepDetector", "invalid currentSensorStep %d preSensorStep %d lastSaveSensorStep %d", new Object[] { Long.valueOf(opc), Long.valueOf(opd), Long.valueOf(opf) });
            l2 = opc;
            opd = l2;
            opf = l2;
            bool1 = true;
          }
          if ((opc - opd >= l7 * j) && (opc - opd >= l6 * j)) {
            break label1277;
          }
          l1 = opc - opd;
          paramSensorEvent = "normalIncrease Valid Step";
          break label749;
          x.i("MicroMsg.Sport.SportStepDetector", "save to cache currentTodayStep %d preSysStepTime %d lastSaveStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(ope), Long.valueOf(opi), Long.valueOf(oph), Long.valueOf(opj) });
        }
        if ((paramSensorEvent == null) || (paramSensorEvent.values == null))
        {
          if (paramSensorEvent == null)
          {
            bool1 = true;
            if (paramSensorEvent == null) {
              break label1183;
            }
          }
          for (boolean bool2 = true;; bool2 = false)
          {
            x.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            return;
            bool1 = false;
            break;
          }
        }
        x.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", new Object[] { Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
        i = 0;
        paramSensorEvent = paramSensorEvent.values;
        int k = paramSensorEvent.length;
        j = 0;
        while (j < k)
        {
          x.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", new Object[] { Integer.valueOf(i), Float.valueOf(paramSensorEvent[j]) });
          j += 1;
          i += 1;
        }
        break;
        paramSensorEvent = "";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sport/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */