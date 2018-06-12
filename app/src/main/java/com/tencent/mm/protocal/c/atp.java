package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class atp
  extends bhp
{
  public int hcE;
  public int lOH;
  public int rWU;
  public int rWV;
  public int rci;
  public bhz rck;
  public long rcq;
  public int rfn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      paramVarArgs.fT(1, this.rfn);
      if (this.rck != null)
      {
        paramVarArgs.fV(2, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rci);
      paramVarArgs.fT(4, this.rWU);
      paramVarArgs.fT(5, this.lOH);
      paramVarArgs.fT(6, this.rWV);
      paramVarArgs.fT(7, this.hcE);
      paramVarArgs.T(8, this.rcq);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rfn) + 0;
      paramInt = i;
      if (this.rck != null) {
        paramInt = i + f.a.a.a.fS(2, this.rck.boi());
      }
      return paramInt + f.a.a.a.fQ(3, this.rci) + f.a.a.a.fQ(4, this.rWU) + f.a.a.a.fQ(5, this.lOH) + f.a.a.a.fQ(6, this.rWV) + f.a.a.a.fQ(7, this.hcE) + f.a.a.a.S(8, this.rcq);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      atp localatp = (atp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localatp.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localatp.rck = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localatp.rci = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localatp.rWU = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localatp.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localatp.rWV = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localatp.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localatp.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/atp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */