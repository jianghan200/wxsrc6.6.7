package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ayk
  extends bhp
{
  public long cfh;
  public int kLd;
  public int kLe;
  public String kLf;
  public String kLg;
  public String kLh;
  public int qYf;
  public bfi ryB;
  public int sbd;
  public int sbe;
  public int sbf;
  public long sbg;
  public long sbh;
  public LinkedList<alo> sbi = new LinkedList();
  public String sbj;
  public String sbk;
  public String sbl;
  public int sbm;
  public int sbn;
  public String sbo;
  
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
      paramVarArgs.fT(2, this.sbd);
      paramVarArgs.fT(3, this.sbe);
      paramVarArgs.fT(4, this.kLd);
      paramVarArgs.T(5, this.cfh);
      paramVarArgs.fT(6, this.sbf);
      paramVarArgs.T(7, this.sbg);
      paramVarArgs.fT(8, this.qYf);
      paramVarArgs.T(9, this.sbh);
      paramVarArgs.fT(10, this.kLe);
      paramVarArgs.d(11, 8, this.sbi);
      if (this.kLf != null) {
        paramVarArgs.g(12, this.kLf);
      }
      if (this.sbj != null) {
        paramVarArgs.g(13, this.sbj);
      }
      if (this.sbk != null) {
        paramVarArgs.g(14, this.sbk);
      }
      if (this.sbl != null) {
        paramVarArgs.g(15, this.sbl);
      }
      paramVarArgs.fT(16, this.sbm);
      if (this.kLh != null) {
        paramVarArgs.g(17, this.kLh);
      }
      paramVarArgs.fT(18, this.sbn);
      if (this.kLg != null) {
        paramVarArgs.g(19, this.kLg);
      }
      if (this.ryB != null)
      {
        paramVarArgs.fV(20, this.ryB.boi());
        this.ryB.a(paramVarArgs);
      }
      if (this.sbo != null) {
        paramVarArgs.g(21, this.sbo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1413;
      }
    }
    label1413:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sbd) + f.a.a.a.fQ(3, this.sbe) + f.a.a.a.fQ(4, this.kLd) + f.a.a.a.S(5, this.cfh) + f.a.a.a.fQ(6, this.sbf) + f.a.a.a.S(7, this.sbg) + f.a.a.a.fQ(8, this.qYf) + f.a.a.a.S(9, this.sbh) + f.a.a.a.fQ(10, this.kLe) + f.a.a.a.c(11, 8, this.sbi);
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.kLf);
      }
      i = paramInt;
      if (this.sbj != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.sbj);
      }
      paramInt = i;
      if (this.sbk != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.sbk);
      }
      i = paramInt;
      if (this.sbl != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.sbl);
      }
      i += f.a.a.a.fQ(16, this.sbm);
      paramInt = i;
      if (this.kLh != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.kLh);
      }
      i = paramInt + f.a.a.a.fQ(18, this.sbn);
      paramInt = i;
      if (this.kLg != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.kLg);
      }
      i = paramInt;
      if (this.ryB != null) {
        i = paramInt + f.a.a.a.fS(20, this.ryB.boi());
      }
      paramInt = i;
      if (this.sbo != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.sbo);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sbi.clear();
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
        ayk localayk = (ayk)paramVarArgs[1];
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
            localayk.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localayk.sbd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localayk.sbe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localayk.kLd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localayk.cfh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localayk.sbf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localayk.sbg = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localayk.qYf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localayk.sbh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 10: 
          localayk.kLe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alo();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localayk.sbi.add(localObject1);
            paramInt += 1;
          }
        case 12: 
          localayk.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localayk.sbj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localayk.sbk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localayk.sbl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localayk.sbm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localayk.kLh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localayk.sbn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localayk.kLg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bfi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bfi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localayk.ryB = ((bfi)localObject1);
            paramInt += 1;
          }
        }
        localayk.sbo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ayk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */