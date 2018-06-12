package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class akc
  extends bhp
{
  public String bHD;
  public String jOS;
  public String ksB;
  public String rMH;
  public String rMI;
  public String rMJ;
  public String rMK;
  public String rML;
  public String rMM;
  public ccm rMN;
  public String rMO;
  public String rMP;
  public String rMQ;
  public String rMR;
  public String rMS;
  public int rMu;
  public LinkedList<ccg> rMv = new LinkedList();
  
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
      if (this.rMH != null) {
        paramVarArgs.g(2, this.rMH);
      }
      if (this.ksB != null) {
        paramVarArgs.g(3, this.ksB);
      }
      if (this.bHD != null) {
        paramVarArgs.g(4, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(5, this.jOS);
      }
      if (this.rMI != null) {
        paramVarArgs.g(6, this.rMI);
      }
      if (this.rMJ != null) {
        paramVarArgs.g(7, this.rMJ);
      }
      if (this.rMK != null) {
        paramVarArgs.g(8, this.rMK);
      }
      if (this.rML != null) {
        paramVarArgs.g(9, this.rML);
      }
      if (this.rMM != null) {
        paramVarArgs.g(10, this.rMM);
      }
      if (this.rMN != null)
      {
        paramVarArgs.fV(11, this.rMN.boi());
        this.rMN.a(paramVarArgs);
      }
      if (this.rMO != null) {
        paramVarArgs.g(12, this.rMO);
      }
      if (this.rMP != null) {
        paramVarArgs.g(13, this.rMP);
      }
      if (this.rMQ != null) {
        paramVarArgs.g(14, this.rMQ);
      }
      if (this.rMR != null) {
        paramVarArgs.g(15, this.rMR);
      }
      if (this.rMS != null) {
        paramVarArgs.g(16, this.rMS);
      }
      paramVarArgs.fT(17, this.rMu);
      paramVarArgs.d(18, 8, this.rMv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1416;
      }
    }
    label1416:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rMH != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rMH);
      }
      i = paramInt;
      if (this.ksB != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ksB);
      }
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bHD);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jOS);
      }
      paramInt = i;
      if (this.rMI != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rMI);
      }
      i = paramInt;
      if (this.rMJ != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rMJ);
      }
      paramInt = i;
      if (this.rMK != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rMK);
      }
      i = paramInt;
      if (this.rML != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rML);
      }
      paramInt = i;
      if (this.rMM != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rMM);
      }
      i = paramInt;
      if (this.rMN != null) {
        i = paramInt + f.a.a.a.fS(11, this.rMN.boi());
      }
      paramInt = i;
      if (this.rMO != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rMO);
      }
      i = paramInt;
      if (this.rMP != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rMP);
      }
      paramInt = i;
      if (this.rMQ != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rMQ);
      }
      i = paramInt;
      if (this.rMR != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rMR);
      }
      paramInt = i;
      if (this.rMS != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rMS);
      }
      return paramInt + f.a.a.a.fQ(17, this.rMu) + f.a.a.a.c(18, 8, this.rMv);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rMv.clear();
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
        akc localakc = (akc)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localakc.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localakc.rMH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localakc.ksB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localakc.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localakc.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localakc.rMI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localakc.rMJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localakc.rMK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localakc.rML = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localakc.rMM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localakc.rMN = ((ccm)localObject1);
            paramInt += 1;
          }
        case 12: 
          localakc.rMO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localakc.rMP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localakc.rMQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localakc.rMR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localakc.rMS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localakc.rMu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ccg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ccg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localakc.rMv.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/akc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */