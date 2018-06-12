package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class wl
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String fky;
  public wf qYa;
  public long qYb;
  public we rAL;
  public boolean rAM = false;
  public xa rAN;
  public boolean rAO = false;
  public wk rAP;
  public boolean rAQ = false;
  public wu rAR;
  public boolean rAS = false;
  public boolean rAT = false;
  public long rAU;
  public boolean rAV = false;
  public int rAW = -1;
  public boolean rAX = false;
  public boolean rAY = false;
  public boolean rAZ = false;
  public wr rBG;
  public boolean rBH = false;
  public LinkedList<vx> rBI = new LinkedList();
  public boolean rBJ = false;
  public boolean rBK = false;
  public vv rBa;
  public boolean rBb = false;
  public boolean rzh = false;
  public boolean rzi = false;
  public String title;
  public int version;
  
  public final wl CM(int paramInt)
  {
    this.rAW = paramInt;
    this.rAX = true;
    return this;
  }
  
  public final wl CN(int paramInt)
  {
    this.version = paramInt;
    this.rBK = true;
    return this;
  }
  
  public final wl Vt(String paramString)
  {
    this.fky = paramString;
    this.rAT = true;
    return this;
  }
  
  public final wl Vu(String paramString)
  {
    this.title = paramString;
    this.rzh = true;
    return this;
  }
  
  public final wl Vv(String paramString)
  {
    this.desc = paramString;
    this.rzi = true;
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rBG != null)
      {
        paramVarArgs.fV(1, this.rBG.boi());
        this.rBG.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.rBI);
      if (this.rAL != null)
      {
        paramVarArgs.fV(3, this.rAL.boi());
        this.rAL.a(paramVarArgs);
      }
      if (this.rAN != null)
      {
        paramVarArgs.fV(4, this.rAN.boi());
        this.rAN.a(paramVarArgs);
      }
      if (this.fky != null) {
        paramVarArgs.g(5, this.fky);
      }
      if (this.title != null) {
        paramVarArgs.g(6, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(7, this.desc);
      }
      if (this.rAV == true) {
        paramVarArgs.T(8, this.rAU);
      }
      if (this.rAX == true) {
        paramVarArgs.fT(91, this.rAW);
      }
      if (this.rAP != null)
      {
        paramVarArgs.fV(10, this.rAP.boi());
        this.rAP.a(paramVarArgs);
      }
      if (this.rAY == true) {
        paramVarArgs.T(11, this.qYb);
      }
      if (this.rAR != null)
      {
        paramVarArgs.fV(12, this.rAR.boi());
        this.rAR.a(paramVarArgs);
      }
      if (this.rBK == true) {
        paramVarArgs.fT(13, this.version);
      }
      if (this.qYa != null)
      {
        paramVarArgs.fV(14, this.qYa.boi());
        this.qYa.a(paramVarArgs);
      }
      if (this.rBa != null)
      {
        paramVarArgs.fV(15, this.rBa.boi());
        this.rBa.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rBG == null) {
        break label1863;
      }
    }
    label1863:
    for (paramInt = f.a.a.a.fS(1, this.rBG.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rBI);
      paramInt = i;
      if (this.rAL != null) {
        paramInt = i + f.a.a.a.fS(3, this.rAL.boi());
      }
      i = paramInt;
      if (this.rAN != null) {
        i = paramInt + f.a.a.a.fS(4, this.rAN.boi());
      }
      paramInt = i;
      if (this.fky != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.fky);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.title);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.desc);
      }
      i = paramInt;
      if (this.rAV == true) {
        i = paramInt + f.a.a.a.S(8, this.rAU);
      }
      paramInt = i;
      if (this.rAX == true) {
        paramInt = i + f.a.a.a.fQ(91, this.rAW);
      }
      i = paramInt;
      if (this.rAP != null) {
        i = paramInt + f.a.a.a.fS(10, this.rAP.boi());
      }
      paramInt = i;
      if (this.rAY == true) {
        paramInt = i + f.a.a.a.S(11, this.qYb);
      }
      i = paramInt;
      if (this.rAR != null) {
        i = paramInt + f.a.a.a.fS(12, this.rAR.boi());
      }
      paramInt = i;
      if (this.rBK == true) {
        paramInt = i + f.a.a.a.fQ(13, this.version);
      }
      i = paramInt;
      if (this.qYa != null) {
        i = paramInt + f.a.a.a.fS(14, this.qYa.boi());
      }
      paramInt = i;
      if (this.rBa != null) {
        paramInt = i + f.a.a.a.fS(15, this.rBa.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rBI.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        wl localwl = (wl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rBG = ((wr)localObject1);
            paramInt += 1;
          }
          localwl.rBH = true;
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new vx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rBI.add(localObject1);
            paramInt += 1;
          }
          localwl.rBJ = true;
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new we();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((we)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rAL = ((we)localObject1);
            paramInt += 1;
          }
          localwl.rAM = true;
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xa();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xa)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rAN = ((xa)localObject1);
            paramInt += 1;
          }
          localwl.rAO = true;
          return 0;
        case 5: 
          localwl.fky = ((f.a.a.a.a)localObject1).vHC.readString();
          localwl.rAT = true;
          return 0;
        case 6: 
          localwl.title = ((f.a.a.a.a)localObject1).vHC.readString();
          localwl.rzh = true;
          return 0;
        case 7: 
          localwl.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          localwl.rzi = true;
          return 0;
        case 8: 
          localwl.rAU = ((f.a.a.a.a)localObject1).vHC.rZ();
          localwl.rAV = true;
          return 0;
        case 91: 
          localwl.rAW = ((f.a.a.a.a)localObject1).vHC.rY();
          localwl.rAX = true;
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rAP = ((wk)localObject1);
            paramInt += 1;
          }
          localwl.rAQ = true;
          return 0;
        case 11: 
          localwl.qYb = ((f.a.a.a.a)localObject1).vHC.rZ();
          localwl.rAY = true;
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.rAR = ((wu)localObject1);
            paramInt += 1;
          }
          localwl.rAS = true;
          return 0;
        case 13: 
          localwl.version = ((f.a.a.a.a)localObject1).vHC.rY();
          localwl.rBK = true;
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localwl.qYa = ((wf)localObject1);
            paramInt += 1;
          }
          localwl.rAZ = true;
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new vv();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((vv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localwl.rBa = ((vv)localObject1);
          paramInt += 1;
        }
        localwl.rBb = true;
        return 0;
      }
      return -1;
    }
  }
  
  public final wl a(wf paramwf)
  {
    this.qYa = paramwf;
    this.rAZ = true;
    return this;
  }
  
  public final wl a(wr paramwr)
  {
    this.rBG = paramwr;
    this.rBH = true;
    return this;
  }
  
  public final wl ar(LinkedList<vx> paramLinkedList)
  {
    this.rBI = paramLinkedList;
    this.rBJ = true;
    return this;
  }
  
  public final wl b(we paramwe)
  {
    this.rAL = paramwe;
    this.rAM = true;
    return this;
  }
  
  public final wl b(wk paramwk)
  {
    this.rAP = paramwk;
    this.rAQ = true;
    return this;
  }
  
  public final wl b(wu paramwu)
  {
    this.rAR = paramwu;
    this.rAS = true;
    return this;
  }
  
  public final wl b(xa paramxa)
  {
    this.rAN = paramxa;
    this.rAO = true;
    return this;
  }
  
  public final wl fS(long paramLong)
  {
    this.rAU = paramLong;
    this.rAV = true;
    return this;
  }
  
  public final wl fT(long paramLong)
  {
    this.qYb = paramLong;
    this.rAY = true;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */