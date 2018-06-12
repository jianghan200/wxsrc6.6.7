package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ach
  extends bhp
{
  public String ID;
  public long hbZ;
  public int hcE;
  public int otY;
  public String rGT;
  public bhy reV;
  public int rfh;
  public LinkedList<pw> rfi = new LinkedList();
  public String rfj;
  public String rfk;
  public String rfl;
  public int rfq;
  public String rfr;
  public String rfs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.reV == null) {
        throw new b("Not all required fields were included: Key");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.ID != null) {
        paramVarArgs.g(2, this.ID);
      }
      if (this.reV != null)
      {
        paramVarArgs.fV(3, this.reV.boi());
        this.reV.a(paramVarArgs);
      }
      if (this.rfr != null) {
        paramVarArgs.g(4, this.rfr);
      }
      if (this.rfs != null) {
        paramVarArgs.g(5, this.rfs);
      }
      paramVarArgs.fT(6, this.hcE);
      paramVarArgs.fT(7, this.rfh);
      paramVarArgs.d(8, 8, this.rfi);
      if (this.rGT != null) {
        paramVarArgs.g(9, this.rGT);
      }
      if (this.rfj != null) {
        paramVarArgs.g(10, this.rfj);
      }
      if (this.rfk != null) {
        paramVarArgs.g(11, this.rfk);
      }
      paramVarArgs.fT(12, this.rfq);
      paramVarArgs.fT(13, this.otY);
      paramVarArgs.T(14, this.hbZ);
      if (this.rfl != null) {
        paramVarArgs.g(15, this.rfl);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1211;
      }
    }
    label1211:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ID);
      }
      i = paramInt;
      if (this.reV != null) {
        i = paramInt + f.a.a.a.fS(3, this.reV.boi());
      }
      paramInt = i;
      if (this.rfr != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rfr);
      }
      i = paramInt;
      if (this.rfs != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rfs);
      }
      i = i + f.a.a.a.fQ(6, this.hcE) + f.a.a.a.fQ(7, this.rfh) + f.a.a.a.c(8, 8, this.rfi);
      paramInt = i;
      if (this.rGT != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rGT);
      }
      i = paramInt;
      if (this.rfj != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rfj);
      }
      paramInt = i;
      if (this.rfk != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rfk);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rfq) + f.a.a.a.fQ(13, this.otY) + f.a.a.a.S(14, this.hbZ);
      paramInt = i;
      if (this.rfl != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rfl);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rfi.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.reV != null) {
          break;
        }
        throw new b("Not all required fields were included: Key");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ach localach = (ach)paramVarArgs[1];
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
            localach.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localach.ID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localach.reV = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localach.rfr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localach.rfs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localach.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localach.rfh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new pw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localach.rfi.add(localObject1);
            paramInt += 1;
          }
        case 9: 
          localach.rGT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localach.rfj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localach.rfk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localach.rfq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localach.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localach.hbZ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localach.rfl = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */