package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bid
  extends com.tencent.mm.bk.a
{
  public LinkedList<arp> siQ = new LinkedList();
  public boolean siR;
  public boolean siS;
  public boolean siT;
  public boolean siU;
  public boolean siV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.siQ);
      paramVarArgs.av(2, this.siR);
      paramVarArgs.av(3, this.siS);
      paramVarArgs.av(4, this.siT);
      paramVarArgs.av(5, this.siU);
      paramVarArgs.av(6, this.siV);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 8, this.siQ) + 0 + (f.a.a.b.b.a.ec(2) + 1) + (f.a.a.b.b.a.ec(3) + 1) + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1) + (f.a.a.b.b.a.ec(6) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.siQ.clear();
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
      bid localbid = (bid)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new arp();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((arp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbid.siQ.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localbid.siR = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      case 3: 
        localbid.siS = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      case 4: 
        localbid.siT = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      case 5: 
        localbid.siU = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      localbid.siV = ((f.a.a.a.a)localObject1).cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */