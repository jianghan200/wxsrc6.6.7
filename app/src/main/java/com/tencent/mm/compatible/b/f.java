package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.jl.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class f
{
  private static volatile f daS = null;
  private static boolean daV = false;
  public static boolean daW = false;
  private static boolean daX = false;
  private static boolean daY = false;
  private static int dbe = 0;
  private static int dbf = 0;
  private static HashMap<Integer, String> dbg = new HashMap();
  private static int dbh = 0;
  private static int dbi = 0;
  private static HashMap<Integer, String> dbj = new HashMap();
  private static int dbk = 0;
  private static int dbl = 0;
  private static HashMap<Integer, String> dbm = new HashMap();
  public final AudioManager daT;
  private int daU = -1;
  private int daZ = 0;
  private final Set<a> dba = new HashSet();
  private final int dbb = 1000;
  private ag dbc = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      x.i("MicroMsg.MMAudioManager", "dkbt post delay BLUETOOTH_DEVICE_CONNECTED ");
      f.this.fC(3);
    }
  };
  private int dbd = -1;
  
  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public f(Context paramContext)
  {
    this.daT = ((AudioManager)paramContext.getSystemService("audio"));
    x.i("MicroMsg.MMAudioManager", "init dkbt %s", new Object[] { yI() });
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        x.i("MicroMsg.MMAudioManager", "leonl onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
        f.this.fC(7);
      }
    }, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        int i = paramAnonymousIntent.getIntExtra("state", -1);
        x.i("MicroMsg.MMAudioManager", "leonl onReceive action[ HEADSET_PLUG ] state = %s,mic = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousIntent.getIntExtra("microphone", -1)) });
        if (i == 0) {
          f.this.fC(6);
        }
        while (i != 1) {
          return;
        }
        f.this.yC();
      }
    }, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent == null) {
          return;
        }
        paramAnonymousContext = paramAnonymousIntent.getAction();
        f.aZ(paramAnonymousIntent.getBooleanExtra("existing", false));
        x.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] existing:" + f.yT());
      }
    }, new IntentFilter("com.htc.accessory.action.CONNECTION_EXISTING"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        x.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_CONNECTED ] ");
        if (d.fS(11))
        {
          f.ba(true);
          f.a(f.this).sendEmptyMessageDelayed(0, 1000L);
        }
      }
    }, new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        x.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_DISCONNECTED ] ");
        f.ba(false);
        if (q.deW.ddv == 1) {
          com.tencent.mm.compatible.c.a.a(f.b(f.this));
        }
        f.this.fC(4);
      }
    }, new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
    if (d.fR(11)) {
      paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          if (paramAnonymousIntent == null) {}
          int i;
          do
          {
            return;
            paramAnonymousContext = paramAnonymousIntent.getAction();
            i = paramAnonymousIntent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            x.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] state:" + i);
            if (i == 2)
            {
              f.ba(true);
              f.a(f.this).sendEmptyMessageDelayed(0, 1000L);
              return;
            }
          } while (i != 0);
          f.ba(false);
          if (q.deW.ddv == 1) {
            com.tencent.mm.compatible.c.a.a(f.b(f.this));
          }
          f.this.fC(4);
        }
      }, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
    }
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent == null) {}
        int i;
        do
        {
          return;
          i = paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
          x.i("MicroMsg.MMAudioManager", "onReceive bluetooth state changed: %s, prevState: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10)) });
        } while (i != 10);
        f.ba(false);
        f.yU();
        if (q.deW.ddv == 1) {
          com.tencent.mm.compatible.c.a.a(f.b(f.this));
        }
        f.this.fC(4);
      }
    }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
  }
  
  public static void fF(int paramInt)
  {
    dbe += 1;
    x.e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbe), Integer.valueOf(dbf) });
    dbg.put(Integer.valueOf(paramInt), bi.cjd().toString());
    yR();
  }
  
  public static void fG(int paramInt)
  {
    dbf += 1;
    x.e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbe), Integer.valueOf(dbf) });
    dbg.remove(Integer.valueOf(paramInt));
  }
  
  public static void fH(int paramInt)
  {
    dbh += 1;
    x.l("MicroMsg.MMAudioManager", "mm audio record init [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbh), Integer.valueOf(dbi) });
    dbj.put(Integer.valueOf(paramInt), bi.cjd().toString());
    yR();
  }
  
  public static void fI(int paramInt)
  {
    if (dbj.containsKey(Integer.valueOf(paramInt)))
    {
      dbi += 1;
      x.l("MicroMsg.MMAudioManager", "mm audio record release [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbh), Integer.valueOf(dbi) });
      dbj.remove(Integer.valueOf(paramInt));
    }
  }
  
  public static void fJ(int paramInt)
  {
    dbk += 1;
    x.e("MicroMsg.MMAudioManager", "mm media player init [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbk), Integer.valueOf(dbl) });
    dbm.put(Integer.valueOf(paramInt), bi.cjd().toString());
    yR();
  }
  
  public static void fK(int paramInt)
  {
    dbl += 1;
    x.e("MicroMsg.MMAudioManager", "mm media player release [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dbk), Integer.valueOf(dbl) });
    dbm.remove(Integer.valueOf(paramInt));
  }
  
  public static boolean yD()
  {
    return false;
  }
  
  @TargetApi(14)
  private static boolean yF()
  {
    boolean bool = true;
    try
    {
      if (Build.VERSION.SDK_INT >= 14)
      {
        int i = BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
        x.i("MicroMsg.MMAudioManager", "isConnectHeadset getProfileConnectionState: %s", new Object[] { Integer.valueOf(i) });
        if (i != 2) {
          break label82;
        }
        return true;
      }
      if (!daV) {
        if (q.deW.ddG == 1)
        {
          bool = BluetoothAdapter.getDefaultAdapter().isEnabled();
          return bool;
        }
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MMAudioManager", "dkbt exception in isConnectDevice()");
      bool = false;
    }
    return bool;
    label82:
    return false;
  }
  
  public static int yG()
  {
    ((AudioManager)ad.getContext().getSystemService("audio")).isBluetoothScoOn();
    return 0;
  }
  
  public static boolean yH()
  {
    x.d("MicroMsg.MMAudioManager", "dkbt isBluetoothCanUse existing:" + daX + " , isUseHTCAccessory = " + daY);
    if ((daX) && (!daY)) {
      return false;
    }
    x.d("MicroMsg.MMAudioManager", "dkbt isACLConnected:" + daV);
    if (!yF())
    {
      x.i("MicroMsg.MMAudioManager", "dkbt isACLConnected =  " + daV + " , isConnectHeadset() = " + yF());
      return false;
    }
    Object localObject = BluetoothAdapter.getDefaultAdapter();
    if (localObject == null)
    {
      x.d("MicroMsg.MMAudioManager", "dkbt BluetoothAdapter.getDefaultAdapter() == null");
      return false;
    }
    if (!((BluetoothAdapter)localObject).isEnabled())
    {
      x.i("MicroMsg.MMAudioManager", "dkbt !adp.isEnabled()");
      return false;
    }
    localObject = ((BluetoothAdapter)localObject).getBondedDevices();
    if ((localObject == null) || (((Set)localObject).size() == 0))
    {
      x.e("MicroMsg.MMAudioManager", "dkbt setDev == null || setDev.size() == 0");
      return false;
    }
    localObject = ((Set)localObject).iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (((BluetoothDevice)((Iterator)localObject).next()).getBondState() != 12);
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        x.i("MicroMsg.MMAudioManager", "dkbt hasBond == false");
        return false;
      }
      x.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothCanUse: %b", new Object[] { Boolean.valueOf(true) });
      return true;
    }
  }
  
  private void yN()
  {
    if (this.daT != null)
    {
      int i = this.daT.getMode();
      boolean bool = this.daT.isSpeakerphoneOn();
      Object localObject1 = com.tencent.mm.compatible.e.l.zh().fM(98305);
      Object localObject2 = com.tencent.mm.compatible.e.l.zh().fM(94209);
      if (localObject1 == null)
      {
        com.tencent.mm.compatible.e.l.zh().set(98305, Boolean.valueOf(bool));
        x.d("MicroMsg.MMAudioManager", "storeAudioConfig spearkeron " + bool);
      }
      if (localObject2 == null)
      {
        com.tencent.mm.compatible.e.l.zh().set(94209, Integer.valueOf(i));
        x.d("MicroMsg.MMAudioManager", "storeAudioConfig inmode " + i);
      }
    }
  }
  
  private static void yR()
  {
    jl localjl = new jl();
    if (dbe - dbf > 1)
    {
      localjl.bTa.bTb = true;
      localjl.bTa.bTc = dbg.size();
    }
    if (dbk - dbl > 1)
    {
      localjl.bTa.bTd = true;
      localjl.bTa.bTe = dbm.size();
    }
    if (dbh - dbi > 1)
    {
      localjl.bTa.bTf = true;
      localjl.bTa.bTg = dbj.size();
    }
    if ((localjl.bTa.bTd) || (localjl.bTa.bTb) || (localjl.bTa.bTf))
    {
      x.e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d] audioRecordLeak [%b %d]", new Object[] { Boolean.valueOf(localjl.bTa.bTb), Integer.valueOf(localjl.bTa.bTc), Boolean.valueOf(localjl.bTa.bTd), Integer.valueOf(localjl.bTa.bTe), Boolean.valueOf(localjl.bTa.bTf), Integer.valueOf(localjl.bTa.bTg) });
      com.tencent.mm.sdk.b.a.sFg.m(localjl);
    }
  }
  
  public static String yS()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AudioTrack: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(dbg.size()).append("init: ").append(dbe).append("release: ").append(dbf).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    Iterator localIterator;
    if (!dbg.isEmpty())
    {
      localIterator = dbg.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
      }
    }
    ((StringBuffer)localObject).append("MediaPlayer: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(dbm.size()).append("init: ").append(dbk).append("release: ").append(dbl).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    if (!dbm.isEmpty())
    {
      localIterator = dbm.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
      }
    }
    ((StringBuffer)localObject).append("AudioRecord: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(dbj.size()).append("init: ").append(dbh).append("release: ").append(dbh).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    if (!dbj.isEmpty())
    {
      localIterator = dbj.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
      }
    }
    localObject = ((StringBuffer)localObject).toString();
    x.e("MicroMsg.MMAudioManager", "leak? %s", new Object[] { localObject });
    return (String)localObject;
  }
  
  public static f yz()
  {
    if (daS == null) {}
    try
    {
      if (daS == null) {
        daS = new f(ad.getContext());
      }
      return daS;
    }
    finally {}
  }
  
  public final void a(a parama)
  {
    if (parama != null) {
      this.dba.add(parama);
    }
  }
  
  public final void aP(int paramInt1, int paramInt2)
  {
    if (this.daT != null)
    {
      x.i("MicroMsg.MMAudioManager", "setStreamVolume streamType:%s,index:%s,flags:%s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      this.daT.setStreamVolume(paramInt1, paramInt2, 0);
    }
  }
  
  public final int aX(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 3; yE(); i = 0) {
      return 0;
    }
    return i;
  }
  
  @TargetApi(11)
  public final boolean aY(boolean paramBoolean)
  {
    int i = 3;
    int k = 0;
    int j = 0;
    x.d("MicroMsg.MMAudioManager", "IPCall dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(yJ()), Boolean.valueOf(paramBoolean), yI() });
    boolean bool;
    if (ar.vZ())
    {
      x.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling blue:%d", new Object[] { Integer.valueOf(this.daU) });
      bool = false;
      return bool;
    }
    if (daW)
    {
      setMode(3);
      return false;
    }
    yN();
    if (q.deN.dcx)
    {
      if (paramBoolean)
      {
        if (Build.VERSION.SDK_INT < 11) {}
        for (i = j;; i = 3)
        {
          if (q.deN.dcy >= 0) {
            i = q.deN.dcy;
          }
          x.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i);
          if (i != this.daT.getMode()) {
            setMode(i);
          }
          bool = paramBoolean;
          if (this.daT.isSpeakerphoneOn()) {
            break;
          }
          setSpeakerphoneOn(true);
          return paramBoolean;
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.deW.ddG != 1) {
          break label705;
        }
        x.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
      }
    }
    label700:
    label705:
    for (i = 0;; i = 2)
    {
      if (q.deN.dcz >= 0) {
        i = q.deN.dcz;
      }
      x.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + i);
      if (i != this.daT.getMode()) {
        setMode(i);
      }
      bool = paramBoolean;
      if (!this.daT.isSpeakerphoneOn()) {
        break;
      }
      setSpeakerphoneOn(false);
      return paramBoolean;
      if (q.deN.dby)
      {
        if (q.deN.yV())
        {
          if (q.deN.dbA >= 0) {
            setMode(q.deN.dbA);
          }
          for (;;)
          {
            bool = paramBoolean;
            if (q.deN.dbC <= 0) {
              break;
            }
            setSpeakerphoneOn(paramBoolean);
            return paramBoolean;
            if (q.deN.dbB >= 0) {
              if (paramBoolean) {
                setMode(0);
              } else {
                setMode(2);
              }
            }
          }
        }
        if (q.deN.yW())
        {
          if (paramBoolean)
          {
            if (q.deN.yZ()) {
              setSpeakerphoneOn(true);
            }
            bool = paramBoolean;
            if (q.deN.yY() < 0) {
              break;
            }
            setMode(q.deN.yY());
            return paramBoolean;
          }
          if (q.deN.zb()) {
            setSpeakerphoneOn(false);
          }
          bool = paramBoolean;
          if (q.deN.za() < 0) {
            break;
          }
          setMode(q.deN.za());
          return paramBoolean;
        }
      }
      if (paramBoolean)
      {
        if (Build.VERSION.SDK_INT < 11) {}
        for (i = k;; i = 3)
        {
          if (q.deN.dbY >= 0) {
            i = q.deN.dbY;
          }
          x.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i);
          if (i != this.daT.getMode()) {
            setMode(i);
          }
          bool = paramBoolean;
          if (this.daT.isSpeakerphoneOn()) {
            break;
          }
          setSpeakerphoneOn(true);
          return paramBoolean;
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.deW.ddG != 1) {
          break label700;
        }
        x.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
      }
      for (i = 0;; i = 2)
      {
        j = i;
        if (Build.VERSION.SDK_INT >= 11)
        {
          j = i;
          if (com.tencent.mm.compatible.util.l.xZ())
          {
            j = i;
            if (2 == q.deW.ddH) {
              j = 2;
            }
          }
        }
        if (q.deN.dbZ >= 0) {
          j = q.deN.dbZ;
        }
        x.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + j);
        if (j != this.daT.getMode()) {
          setMode(j);
        }
        bool = paramBoolean;
        if (!this.daT.isSpeakerphoneOn()) {
          break;
        }
        setSpeakerphoneOn(false);
        return paramBoolean;
      }
    }
  }
  
  public final void b(a parama)
  {
    if (parama != null) {
      this.dba.remove(parama);
    }
  }
  
  public final boolean b(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    int i = this.daT.getStreamMaxVolume(paramInt);
    x.d("MicroMsg.MMAudioManager", "maxVolumn:" + i);
    i /= 3;
    int j = this.daT.getStreamVolume(paramInt);
    if (j < i) {
      this.daT.setStreamVolume(paramInt, i, 0);
    }
    x.i("MicroMsg.MMAudioManager", "StreamType:" + paramInt + "  current:" + j);
    return e(paramBoolean1, true, paramBoolean2);
  }
  
  @TargetApi(11)
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 1;
    int k = 0;
    int j = 0;
    int m = this.daT.getMode();
    x.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(yJ()), Boolean.valueOf(paramBoolean1), yI() });
    if (ar.vZ())
    {
      x.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling Mode:%d blue:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(this.daU) });
      paramBoolean2 = false;
    }
    do
    {
      do
      {
        return paramBoolean2;
        if ((!paramBoolean3) && ((yE()) || (daW)))
        {
          x.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker isBluetoothOn");
          if (!paramBoolean2) {
            setMode(0);
          }
          for (;;)
          {
            return false;
            x.d("MicroMsg.MMAudioManager", "Bluetooth is on and now is in VoIP , set 3 MODE_IN_COMMUNICATION..");
            setMode(3);
          }
        }
        yN();
        if (!paramBoolean2) {
          break label325;
        }
        if (!q.deN.dby) {
          break label569;
        }
        if (q.deN.yV())
        {
          if (q.deN.dbA >= 0) {
            setMode(q.deN.dbA);
          }
          for (;;)
          {
            paramBoolean2 = paramBoolean1;
            if (q.deN.dbC <= 0) {
              break;
            }
            setSpeakerphoneOn(paramBoolean1);
            return paramBoolean1;
            if (q.deN.dbB >= 0) {
              if (paramBoolean1) {
                setMode(0);
              } else {
                setMode(2);
              }
            }
          }
        }
        if (!q.deN.yW()) {
          break label569;
        }
        if (!paramBoolean1) {
          break;
        }
        if (q.deN.yZ()) {
          setSpeakerphoneOn(true);
        }
        paramBoolean2 = paramBoolean1;
      } while (q.deN.yY() < 0);
      setMode(q.deN.yY());
      return paramBoolean1;
      if (q.deN.zb()) {
        setSpeakerphoneOn(false);
      }
      paramBoolean2 = paramBoolean1;
    } while (q.deN.za() < 0);
    setMode(q.deN.za());
    return paramBoolean1;
    label325:
    if ((q.deN.dby) && (q.deN.yX()))
    {
      if (paramBoolean1)
      {
        localObject = q.deN;
        i = j;
        if (((b)localObject).yX())
        {
          k = ((b)localObject).dbE & 0x10;
          localObject = new StringBuilder("enableSpeaker ");
          if (k <= 0) {
            break label453;
          }
        }
        label453:
        for (paramBoolean2 = true;; paramBoolean2 = false)
        {
          x.d("VoipAudioInfo", paramBoolean2);
          i = j;
          if (k > 0) {
            i = 1;
          }
          if (i != 0) {
            setSpeakerphoneOn(true);
          }
          paramBoolean2 = paramBoolean1;
          if (q.deN.zc() < 0) {
            break;
          }
          setMode(q.deN.zc());
          return paramBoolean1;
        }
      }
      Object localObject = q.deN;
      if (((b)localObject).yX())
      {
        j = ((b)localObject).dbE & 0x1;
        localObject = new StringBuilder("disableSpeaker ");
        if (j > 0)
        {
          paramBoolean2 = true;
          label499:
          x.d("VoipAudioInfo", paramBoolean2);
          if (j <= 0) {
            break label557;
          }
        }
      }
      for (;;)
      {
        if (i != 0) {
          setSpeakerphoneOn(false);
        }
        paramBoolean2 = paramBoolean1;
        if (q.deN.zd() < 0) {
          break;
        }
        setMode(q.deN.zd());
        return paramBoolean1;
        paramBoolean2 = false;
        break label499;
        label557:
        i = 0;
        continue;
        i = 0;
      }
    }
    label569:
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        if (Build.VERSION.SDK_INT < 11)
        {
          i = k;
          label589:
          if (q.deN.dbY >= 0) {
            i = q.deN.dbY;
          }
          x.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker useSpeakerMode:" + i);
          if (i != this.daT.getMode()) {
            setMode(i);
          }
          if (i != this.daT.getMode())
          {
            if (this.daZ != 0) {
              break label696;
            }
            this.daZ = 1;
          }
        }
        for (;;)
        {
          paramBoolean2 = paramBoolean1;
          if (this.daT.isSpeakerphoneOn()) {
            break;
          }
          setSpeakerphoneOn(true);
          return paramBoolean1;
          i = 3;
          break label589;
          label696:
          if (this.daZ == 2) {
            this.daZ = 3;
          }
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.deW.ddG != 1) {
          break label982;
        }
        x.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
        i = 0;
      }
    }
    for (;;)
    {
      label741:
      j = i;
      if (Build.VERSION.SDK_INT >= 11)
      {
        j = i;
        if (com.tencent.mm.compatible.util.l.xZ())
        {
          j = i;
          if (2 == q.deW.ddH) {
            j = 2;
          }
        }
      }
      if (q.deN.dbZ >= 0) {
        j = q.deN.dbZ;
      }
      x.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker usePhoneMode:" + j);
      if (j != this.daT.getMode()) {
        setMode(j);
      }
      if (j != this.daT.getMode())
      {
        if (this.daZ != 0) {
          break label887;
        }
        this.daZ = 2;
      }
      for (;;)
      {
        paramBoolean2 = paramBoolean1;
        if (!this.daT.isSpeakerphoneOn()) {
          break;
        }
        setSpeakerphoneOn(false);
        return paramBoolean1;
        i = 3;
        break label741;
        label887:
        if (this.daZ == 1) {
          this.daZ = 3;
        }
      }
      setSpeakerphoneOn(paramBoolean1);
      paramBoolean2 = paramBoolean1;
      if (yJ() == paramBoolean1) {
        break;
      }
      if (paramBoolean1)
      {
        setMode(0);
        return paramBoolean1;
      }
      if ((Build.VERSION.SDK_INT >= 11) && (com.tencent.mm.compatible.util.l.xZ()) && (2 != q.deW.ddH))
      {
        setMode(3);
        return paramBoolean1;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        setMode(3);
        return paramBoolean1;
      }
      setMode(2);
      return paramBoolean1;
      label982:
      i = 2;
    }
  }
  
  public final void fC(int paramInt)
  {
    x.i("MicroMsg.MMAudioManager", "notify, new status: %d, current status: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.daU) });
    Iterator localIterator = this.dba.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).ew(paramInt);
    }
  }
  
  public final void fD(int paramInt)
  {
    if (this.daT != null) {
      this.daT.adjustStreamVolume(paramInt, 1, 5);
    }
  }
  
  public final void fE(int paramInt)
  {
    if (this.daT != null) {
      this.daT.adjustStreamVolume(paramInt, -1, 5);
    }
  }
  
  public final int getStreamMaxVolume(int paramInt)
  {
    if (this.daT != null) {
      return this.daT.getStreamMaxVolume(paramInt);
    }
    return 5;
  }
  
  public final int getStreamVolume(int paramInt)
  {
    if (this.daT != null) {
      return this.daT.getStreamVolume(paramInt);
    }
    return -1;
  }
  
  public final void setMode(int paramInt)
  {
    if (this.daT != null)
    {
      x.i("MicroMsg.MMAudioManager", "set mode from %d to %d", new Object[] { Integer.valueOf(this.daT.getMode()), Integer.valueOf(paramInt) });
      this.daT.setMode(paramInt);
    }
  }
  
  public final void setSpeakerphoneOn(boolean paramBoolean)
  {
    x.l("MicroMsg.MMAudioManager", "setSpeakerphoneOn, on: " + paramBoolean, new Object[0]);
    if (this.daT != null)
    {
      x.i("MicroMsg.MMAudioManager", "setSpeakerphoneOn on: " + paramBoolean);
      this.daT.setSpeakerphoneOn(paramBoolean);
    }
  }
  
  public final void yA()
  {
    x.i("MicroMsg.MMAudioManager", "dkbt bluetoothStopped %s", new Object[] { yI() });
    daW = false;
    fC(2);
  }
  
  public final int yB()
  {
    int i = 1;
    this.daU = -1;
    if (!yH())
    {
      i = -1;
      return i;
    }
    x.l("MicroMsg.MMAudioManager", "dkbt begin tryStartBluetooth %s", new Object[] { yI() });
    AudioManager localAudioManager = this.daT;
    boolean bool;
    if (!localAudioManager.isBluetoothScoAvailableOffCall()) {
      bool = false;
    }
    for (;;)
    {
      x.i("MicroMsg.MMAudioManager", "dkbt end tryStartBluetooth %s ret:%s", new Object[] { yI(), Boolean.valueOf(bool) });
      x.d("MicroMsg.MMAudioManager", "dkbt  tryStartBluetooth " + yI() + " ret:" + bool);
      bool = yE();
      x.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        break;
      }
      return 0;
      if (ar.vZ())
      {
        bool = false;
      }
      else
      {
        x.i("MicroMsg.BluetoothUtil", "start DeviceInfo mCommonInfo getStartBluetoothSco:%s ", new Object[] { Integer.valueOf(q.deW.ddx) });
        if (((q.deW.ddx == 1) || (q.deW.ddx == -1)) && (!localAudioManager.isBluetoothScoOn()))
        {
          x.i("MicroMsg.BluetoothUtil", "BluetoothUtil am.isBluetoothScoOn is false and startBluetoothSco, stack: %s", new Object[] { bi.cjd() });
          localAudioManager.startBluetoothSco();
        }
        bool = true;
      }
    }
  }
  
  public final void yC()
  {
    daW = false;
    x.l("MicroMsg.MMAudioManager", "dkbt begin stopBluetooth %s", new Object[] { yI() });
    com.tencent.mm.compatible.c.a.a(this.daT);
    this.dbc.removeCallbacksAndMessages(Integer.valueOf(1));
    x.i("MicroMsg.MMAudioManager", "dkbt end stopBluetooth %s", new Object[] { yI() });
  }
  
  public final boolean yE()
  {
    boolean bool = false;
    x.i("MicroMsg.MMAudioManager", "isBluetoothScoOn: %s isBluetoothA2dpOn: %s, isScoConnected: %s, isBluetoothCanUse: %s, isACLConnected: %s", new Object[] { Boolean.valueOf(this.daT.isBluetoothScoOn()), Boolean.valueOf(this.daT.isBluetoothA2dpOn()), Boolean.valueOf(daW), Boolean.valueOf(yH()), Boolean.valueOf(daV) });
    if ((this.daT.isBluetoothScoOn()) || (this.daT.isBluetoothA2dpOn()) || (daW)) {
      bool = true;
    }
    return bool;
  }
  
  public final String yI()
  {
    if (this.daT != null) {}
    for (int i = this.daT.getMode();; i = 0) {
      return "mode:" + i + " isSpeakerphoneOn:" + this.daT.isSpeakerphoneOn() + " isBluetoothOn:" + yE() + " btStatus:" + this.daU;
    }
  }
  
  public final boolean yJ()
  {
    return this.daT.getMode() == 0;
  }
  
  public final boolean yK()
  {
    if (this.daT != null) {
      return this.daT.isWiredHeadsetOn();
    }
    return false;
  }
  
  public final void yL()
  {
    if (this.daT != null) {
      this.daT.setStreamMute(3, true);
    }
  }
  
  public final void yM()
  {
    if (this.daT != null) {
      this.daT.setStreamMute(3, false);
    }
  }
  
  @Deprecated
  public final void yO()
  {
    Object localObject2;
    if (this.daT != null)
    {
      Object localObject1 = com.tencent.mm.compatible.e.l.zh().fM(98305);
      localObject2 = com.tencent.mm.compatible.e.l.zh().fM(94209);
      if (localObject1 != null)
      {
        x.d("MicroMsg.MMAudioManager", "resumeAudioConfig spearkeron: " + localObject1);
        setSpeakerphoneOn(((Boolean)localObject1).booleanValue());
        com.tencent.mm.compatible.e.l.zh().set(98305, null);
      }
      if (localObject2 == null) {}
    }
    try
    {
      x.i("MicroMsg.MMAudioManager", "resumeAudioConfig oinmode: " + localObject2 + ",inmode:0");
      i = bi.getInt(String.valueOf(localObject2), 0);
      if ((i >= -1) && (i < 4))
      {
        setMode(i);
        com.tencent.mm.compatible.e.l.zh().set(94209, null);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = 0;
        continue;
        setMode(0);
      }
    }
  }
  
  public final int yP()
  {
    int i = this.daZ;
    this.daZ = 0;
    return i;
  }
  
  public final int yQ()
  {
    if (this.dbd == -1) {}
    try
    {
      Field localField = Class.forName("android.media.AudioManager").getField("STREAM_BLUETOOTH_SCO");
      if ((localField != null) && (this.daT != null)) {
        this.dbd = localField.getInt(this.daT);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MMAudioManager", "ClassNotFoundException  android.media.AudioManager,exception:" + localException.getMessage());
        this.dbd = 6;
      }
    }
    return this.dbd;
  }
  
  public static abstract interface a
  {
    public abstract void ew(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */