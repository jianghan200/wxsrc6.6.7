package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class kj
  extends bhp
{
  public String jTu;
  public String jTv;
  public int lOH;
  public long rcq;
  public String rmC;
  public String rmn;
  public String rmy;
  
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
      if (this.rmn != null) {
        paramVarArgs.g(3, this.rmn);
      }
      if (this.jTv != null) {
        paramVarArgs.g(4, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(5, this.jTu);
      }
      paramVarArgs.fT(9, this.lOH);
      paramVarArgs.T(10, this.rcq);
      if (this.rmy != null) {
        paramVarArgs.g(11, this.rmy);
      }
      if (this.rmC != null) {
        paramVarArgs.g(12, this.rmC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label682;
      }
    }
    label682:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rmn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rmn);
      }
      i = paramInt;
      if (this.jTv != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jTv);
      }
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jTu);
      }
      i = paramInt + f.a.a.a.fQ(9, this.lOH) + f.a.a.a.S(10, this.rcq);
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rmy);
      }
      i = paramInt;
      if (this.rmC != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rmC);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        kj localkj = (kj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 2: 
        case 6: 
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localkj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 3: 
          localkj.rmn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localkj.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localkj.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localkj.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localkj.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 11: 
          localkj.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localkj.rmC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */