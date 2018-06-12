package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Reporters
{
  public static PerformanceTracer.Visitor detail(AudioInformation paramAudioInformation, Map<String, String> paramMap)
  {
    return new Reporters.1(paramAudioInformation, paramMap);
  }
  
  private static void generateDetailedPerformance(List<PerformanceTracer.SpeedCheck> paramList, StringBuilder paramStringBuilder, long paramLong)
  {
    paramStringBuilder.append("\n详细性能数据:\n");
    paramStringBuilder.append(String.format(Locale.getDefault(), "\t%15s%15s%15s%15s%15s", new Object[] { "名称", "平均速度(byte/ms)", "耗时(ms)", "数据量(byte)", "占总耗时比" }));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      PerformanceTracer.SpeedCheck localSpeedCheck = (PerformanceTracer.SpeedCheck)paramList.next();
      paramStringBuilder.append("\n");
      paramStringBuilder.append(String.format(Locale.getDefault(), "\t%15s%15.0f%15.0f%15.0f%15d%15d%13.2f", new Object[] { localSpeedCheck.getName(), Double.valueOf(localSpeedCheck.getAvg()), Double.valueOf(localSpeedCheck.getMax()), Double.valueOf(localSpeedCheck.getMin()), Long.valueOf(localSpeedCheck.getTotalTimeMs()), Long.valueOf(localSpeedCheck.getTotalBufferLength()), Double.valueOf(localSpeedCheck.getTotalTimeMs() / paramLong) }));
    }
    paramStringBuilder.append("\n");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/perf/Reporters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */