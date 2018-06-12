package com.tencent.mm.protocal.a.a;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bk.a
{
  public LinkedList<e> qXA = new LinkedList();
  public b qXB;
  public int qXj;
  public int qXx;
  public int qXz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qXj);
      paramVarArgs.fT(2, this.qXz);
      paramVarArgs.fT(3, this.qXx);
      paramVarArgs.d(4, 8, this.qXA);
      if (this.qXB != null) {
        paramVarArgs.b(5, this.qXB);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.qXj) + 0 + f.a.a.a.fQ(2, this.qXz) + f.a.a.a.fQ(3, this.qXx) + f.a.a.a.c(4, 8, this.qXA);
      paramInt = i;
    } while (this.qXB == null);
    return i + f.a.a.a.a(5, this.qXB);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXA.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locali.qXj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locali.qXz = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locali.qXx = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locali.qXA.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      locali.qXB = ((f.a.a.a.a)localObject1).cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */