package com.tencent.mm.protocal.c;

import d.a.a.c;
import f.a.a.b;
import java.util.LinkedList;

public final class jk
  extends bhp
{
  public int hwV;
  public String hwW;
  public c pqb;
  public long pqd;
  public long rkZ;
  public LinkedList<String> rla = new LinkedList();
  public int rlb;
  public int rlc;
  
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
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.T(4, this.pqd);
      if (this.pqb != null)
      {
        paramVarArgs.fV(5, this.pqb.boi());
        this.pqb.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.rkZ);
      paramVarArgs.d(7, 1, this.rla);
      paramVarArgs.fT(8, this.rlb);
      paramVarArgs.fT(9, this.rlc);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label755;
      }
    }
    label755:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.S(4, this.pqd);
      paramInt = i;
      if (this.pqb != null) {
        paramInt = i + f.a.a.a.fS(5, this.pqb.boi());
      }
      return paramInt + f.a.a.a.S(6, this.rkZ) + f.a.a.a.c(7, 1, this.rla) + f.a.a.a.fQ(8, this.rlb) + f.a.a.a.fQ(9, this.rlc);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rla.clear();
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
        jk localjk = (jk)paramVarArgs[1];
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
            localjk.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localjk.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localjk.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localjk.pqd = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new c();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((c)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localjk.pqb = ((c)localObject1);
            paramInt += 1;
          }
        case 6: 
          localjk.rkZ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          localjk.rla.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 8: 
          localjk.rlb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localjk.rlc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */