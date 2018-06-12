package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bee
  extends bhp
{
  public long cfh;
  public int kLd;
  public int kLe;
  public String kLf;
  public String kLg;
  public String kLh;
  public int qYf;
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
      paramVarArgs.T(2, this.cfh);
      paramVarArgs.fT(3, this.sbf);
      paramVarArgs.T(4, this.sbg);
      paramVarArgs.fT(5, this.qYf);
      paramVarArgs.T(6, this.sbh);
      paramVarArgs.fT(9, this.kLe);
      paramVarArgs.d(10, 8, this.sbi);
      if (this.kLf != null) {
        paramVarArgs.g(11, this.kLf);
      }
      if (this.sbj != null) {
        paramVarArgs.g(12, this.sbj);
      }
      if (this.sbk != null) {
        paramVarArgs.g(13, this.sbk);
      }
      if (this.sbl != null) {
        paramVarArgs.g(14, this.sbl);
      }
      paramVarArgs.fT(15, this.sbm);
      if (this.kLh != null) {
        paramVarArgs.g(16, this.kLh);
      }
      paramVarArgs.fT(17, this.sbn);
      if (this.kLg != null) {
        paramVarArgs.g(18, this.kLg);
      }
      paramVarArgs.fT(19, this.sbe);
      paramVarArgs.fT(20, this.kLd);
      paramVarArgs.fT(21, this.sbd);
      if (this.sbo != null) {
        paramVarArgs.g(22, this.sbo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1276;
      }
    }
    label1276:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.cfh) + f.a.a.a.fQ(3, this.sbf) + f.a.a.a.S(4, this.sbg) + f.a.a.a.fQ(5, this.qYf) + f.a.a.a.S(6, this.sbh) + f.a.a.a.fQ(9, this.kLe) + f.a.a.a.c(10, 8, this.sbi);
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.kLf);
      }
      i = paramInt;
      if (this.sbj != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.sbj);
      }
      paramInt = i;
      if (this.sbk != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.sbk);
      }
      i = paramInt;
      if (this.sbl != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.sbl);
      }
      i += f.a.a.a.fQ(15, this.sbm);
      paramInt = i;
      if (this.kLh != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.kLh);
      }
      i = paramInt + f.a.a.a.fQ(17, this.sbn);
      paramInt = i;
      if (this.kLg != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.kLg);
      }
      i = paramInt + f.a.a.a.fQ(19, this.sbe) + f.a.a.a.fQ(20, this.kLd) + f.a.a.a.fQ(21, this.sbd);
      paramInt = i;
      if (this.sbo != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.sbo);
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
        bee localbee = (bee)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 7: 
        case 8: 
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
            localbee.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbee.cfh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localbee.sbf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbee.sbg = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbee.qYf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbee.sbh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          localbee.kLe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alo();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbee.sbi.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          localbee.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbee.sbj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbee.sbk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbee.sbl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbee.sbm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localbee.kLh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localbee.sbn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localbee.kLg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localbee.sbe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localbee.kLd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localbee.sbd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbee.sbo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */