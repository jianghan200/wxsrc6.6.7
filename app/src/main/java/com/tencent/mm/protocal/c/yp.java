package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class yp
  extends bhp
{
  public String SSID;
  public String bHD;
  public String hbL;
  public String jSA;
  public String ksB;
  public String qYZ;
  public int qZk;
  public bhy rEB;
  public String rEC;
  public String rED;
  public aok rEE;
  public yl rEF;
  public String rEG;
  public int rEH;
  public LinkedList<ir> rEI = new LinkedList();
  public String rEJ;
  public qw rEK;
  public bhy rEL;
  public int rEM;
  public LinkedList<amu> rEN = new LinkedList();
  public String rEO;
  public String rEP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rEC != null) {
        paramVarArgs.g(2, this.rEC);
      }
      if (this.rED != null) {
        paramVarArgs.g(3, this.rED);
      }
      paramVarArgs.fT(4, this.qZk);
      if (this.bHD != null) {
        paramVarArgs.g(5, this.bHD);
      }
      if (this.jSA != null) {
        paramVarArgs.g(6, this.jSA);
      }
      if (this.rEE != null)
      {
        paramVarArgs.fV(7, this.rEE.boi());
        this.rEE.a(paramVarArgs);
      }
      if (this.rEF != null)
      {
        paramVarArgs.fV(8, this.rEF.boi());
        this.rEF.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(9, this.hbL);
      }
      if (this.rEG != null) {
        paramVarArgs.g(15, this.rEG);
      }
      paramVarArgs.fT(16, this.rEH);
      paramVarArgs.d(17, 8, this.rEI);
      if (this.rEJ != null) {
        paramVarArgs.g(18, this.rEJ);
      }
      if (this.SSID != null) {
        paramVarArgs.g(20, this.SSID);
      }
      if (this.qYZ != null) {
        paramVarArgs.g(21, this.qYZ);
      }
      if (this.rEK != null)
      {
        paramVarArgs.fV(22, this.rEK.boi());
        this.rEK.a(paramVarArgs);
      }
      if (this.rEL != null)
      {
        paramVarArgs.fV(23, this.rEL.boi());
        this.rEL.a(paramVarArgs);
      }
      paramVarArgs.fT(24, this.rEM);
      paramVarArgs.d(25, 8, this.rEN);
      if (this.ksB != null) {
        paramVarArgs.g(26, this.ksB);
      }
      if (this.rEO != null) {
        paramVarArgs.g(27, this.rEO);
      }
      if (this.rEB != null)
      {
        paramVarArgs.fV(28, this.rEB.boi());
        this.rEB.a(paramVarArgs);
      }
      if (this.rEP != null) {
        paramVarArgs.g(29, this.rEP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label2141;
      }
    }
    label2141:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rEC != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rEC);
      }
      i = paramInt;
      if (this.rED != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rED);
      }
      i += f.a.a.a.fQ(4, this.qZk);
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.bHD);
      }
      i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.jSA);
      }
      paramInt = i;
      if (this.rEE != null) {
        paramInt = i + f.a.a.a.fS(7, this.rEE.boi());
      }
      i = paramInt;
      if (this.rEF != null) {
        i = paramInt + f.a.a.a.fS(8, this.rEF.boi());
      }
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hbL);
      }
      i = paramInt;
      if (this.rEG != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rEG);
      }
      i = i + f.a.a.a.fQ(16, this.rEH) + f.a.a.a.c(17, 8, this.rEI);
      paramInt = i;
      if (this.rEJ != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.rEJ);
      }
      i = paramInt;
      if (this.SSID != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.SSID);
      }
      paramInt = i;
      if (this.qYZ != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.qYZ);
      }
      i = paramInt;
      if (this.rEK != null) {
        i = paramInt + f.a.a.a.fS(22, this.rEK.boi());
      }
      paramInt = i;
      if (this.rEL != null) {
        paramInt = i + f.a.a.a.fS(23, this.rEL.boi());
      }
      i = paramInt + f.a.a.a.fQ(24, this.rEM) + f.a.a.a.c(25, 8, this.rEN);
      paramInt = i;
      if (this.ksB != null) {
        paramInt = i + f.a.a.b.b.a.h(26, this.ksB);
      }
      i = paramInt;
      if (this.rEO != null) {
        i = paramInt + f.a.a.b.b.a.h(27, this.rEO);
      }
      paramInt = i;
      if (this.rEB != null) {
        paramInt = i + f.a.a.a.fS(28, this.rEB.boi());
      }
      i = paramInt;
      if (this.rEP != null) {
        i = paramInt + f.a.a.b.b.a.h(29, this.rEP);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rEI.clear();
        this.rEN.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        yp localyp = (yp)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 19: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localyp.rEC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localyp.rED = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localyp.qZk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localyp.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localyp.jSA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aok();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aok)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEE = ((aok)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new yl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((yl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEF = ((yl)localObject1);
            paramInt += 1;
          }
        case 9: 
          localyp.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localyp.rEG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localyp.rEH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ir();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ir)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEI.add(localObject1);
            paramInt += 1;
          }
        case 18: 
          localyp.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localyp.SSID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localyp.qYZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEK = ((qw)localObject1);
            paramInt += 1;
          }
        case 23: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEL = ((bhy)localObject1);
            paramInt += 1;
          }
        case 24: 
          localyp.rEM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new amu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((amu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEN.add(localObject1);
            paramInt += 1;
          }
        case 26: 
          localyp.ksB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 27: 
          localyp.rEO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyp.rEB = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localyp.rEP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */