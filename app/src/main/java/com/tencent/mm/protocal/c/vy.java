package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class vy
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String fky;
  public wf qYa;
  public long qYb;
  public vz rAJ;
  public boolean rAK = false;
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
  public vv rBa;
  public boolean rBb = false;
  public boolean rzh = false;
  public boolean rzi = false;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rAJ != null)
      {
        paramVarArgs.fV(1, this.rAJ.boi());
        this.rAJ.a(paramVarArgs);
      }
      if (this.rAL != null)
      {
        paramVarArgs.fV(2, this.rAL.boi());
        this.rAL.a(paramVarArgs);
      }
      if (this.rAN != null)
      {
        paramVarArgs.fV(3, this.rAN.boi());
        this.rAN.a(paramVarArgs);
      }
      if (this.rAP != null)
      {
        paramVarArgs.fV(4, this.rAP.boi());
        this.rAP.a(paramVarArgs);
      }
      if (this.rAR != null)
      {
        paramVarArgs.fV(5, this.rAR.boi());
        this.rAR.a(paramVarArgs);
      }
      if (this.fky != null) {
        paramVarArgs.g(6, this.fky);
      }
      if (this.title != null) {
        paramVarArgs.g(7, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(8, this.desc);
      }
      if (this.rAV == true) {
        paramVarArgs.T(9, this.rAU);
      }
      if (this.rAX == true) {
        paramVarArgs.fT(101, this.rAW);
      }
      if (this.rAY == true) {
        paramVarArgs.T(11, this.qYb);
      }
      if (this.qYa != null)
      {
        paramVarArgs.fV(12, this.qYa.boi());
        this.qYa.a(paramVarArgs);
      }
      if (this.rBa != null)
      {
        paramVarArgs.fV(13, this.rBa.boi());
        this.rBa.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rAJ == null) {
        break label1645;
      }
    }
    label1645:
    for (int i = f.a.a.a.fS(1, this.rAJ.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rAL != null) {
        paramInt = i + f.a.a.a.fS(2, this.rAL.boi());
      }
      i = paramInt;
      if (this.rAN != null) {
        i = paramInt + f.a.a.a.fS(3, this.rAN.boi());
      }
      paramInt = i;
      if (this.rAP != null) {
        paramInt = i + f.a.a.a.fS(4, this.rAP.boi());
      }
      i = paramInt;
      if (this.rAR != null) {
        i = paramInt + f.a.a.a.fS(5, this.rAR.boi());
      }
      paramInt = i;
      if (this.fky != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.fky);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.title);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.desc);
      }
      i = paramInt;
      if (this.rAV == true) {
        i = paramInt + f.a.a.a.S(9, this.rAU);
      }
      paramInt = i;
      if (this.rAX == true) {
        paramInt = i + f.a.a.a.fQ(101, this.rAW);
      }
      i = paramInt;
      if (this.rAY == true) {
        i = paramInt + f.a.a.a.S(11, this.qYb);
      }
      paramInt = i;
      if (this.qYa != null) {
        paramInt = i + f.a.a.a.fS(12, this.qYa.boi());
      }
      i = paramInt;
      if (this.rBa != null) {
        i = paramInt + f.a.a.a.fS(13, this.rBa.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        vy localvy = (vy)paramVarArgs[1];
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
            localObject1 = new vz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.rAJ = ((vz)localObject1);
            paramInt += 1;
          }
          localvy.rAK = true;
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new we();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((we)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.rAL = ((we)localObject1);
            paramInt += 1;
          }
          localvy.rAM = true;
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xa();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xa)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.rAN = ((xa)localObject1);
            paramInt += 1;
          }
          localvy.rAO = true;
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.rAP = ((wk)localObject1);
            paramInt += 1;
          }
          localvy.rAQ = true;
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.rAR = ((wu)localObject1);
            paramInt += 1;
          }
          localvy.rAS = true;
          return 0;
        case 6: 
          localvy.fky = ((f.a.a.a.a)localObject1).vHC.readString();
          localvy.rAT = true;
          return 0;
        case 7: 
          localvy.title = ((f.a.a.a.a)localObject1).vHC.readString();
          localvy.rzh = true;
          return 0;
        case 8: 
          localvy.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          localvy.rzi = true;
          return 0;
        case 9: 
          localvy.rAU = ((f.a.a.a.a)localObject1).vHC.rZ();
          localvy.rAV = true;
          return 0;
        case 101: 
          localvy.rAW = ((f.a.a.a.a)localObject1).vHC.rY();
          localvy.rAX = true;
          return 0;
        case 11: 
          localvy.qYb = ((f.a.a.a.a)localObject1).vHC.rZ();
          localvy.rAY = true;
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localvy.qYa = ((wf)localObject1);
            paramInt += 1;
          }
          localvy.rAZ = true;
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
          localvy.rBa = ((vv)localObject1);
          paramInt += 1;
        }
        localvy.rBb = true;
        return 0;
      }
      return -1;
    }
  }
  
  public final vy a(vv paramvv)
  {
    this.rBa = paramvv;
    this.rBb = true;
    return this;
  }
  
  public final vy a(we paramwe)
  {
    this.rAL = paramwe;
    this.rAM = true;
    return this;
  }
  
  public final vy a(wk paramwk)
  {
    this.rAP = paramwk;
    this.rAQ = true;
    return this;
  }
  
  public final vy a(wu paramwu)
  {
    this.rAR = paramwu;
    this.rAS = true;
    return this;
  }
  
  public final vy a(xa paramxa)
  {
    this.rAN = paramxa;
    this.rAO = true;
    return this;
  }
  
  public final vy c(vz paramvz)
  {
    this.rAJ = paramvz;
    this.rAK = true;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */