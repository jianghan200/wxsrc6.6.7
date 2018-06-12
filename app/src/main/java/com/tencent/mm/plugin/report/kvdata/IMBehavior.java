package com.tencent.mm.plugin.report.kvdata;

import java.util.LinkedList;

public class IMBehavior
  extends com.tencent.mm.bk.a
{
  public IMBehaviorChattingOP chattingOp;
  public IMBehaviorMsgOP msgOp;
  public int opType;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.opType);
      if (this.chattingOp != null)
      {
        paramVarArgs.fV(2, this.chattingOp.boi());
        this.chattingOp.a(paramVarArgs);
      }
      if (this.msgOp != null)
      {
        paramVarArgs.fV(3, this.msgOp.boi());
        this.msgOp.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.opType) + 0;
      paramInt = i;
      if (this.chattingOp != null) {
        paramInt = i + f.a.a.a.fS(2, this.chattingOp.boi());
      }
      i = paramInt;
    } while (this.msgOp == null);
    return paramInt + f.a.a.a.fS(3, this.msgOp.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      IMBehavior localIMBehavior = (IMBehavior)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localIMBehavior.opType = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new IMBehaviorChattingOP();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((IMBehaviorChattingOP)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localIMBehavior.chattingOp = ((IMBehaviorChattingOP)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new IMBehaviorMsgOP();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((IMBehaviorMsgOP)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localIMBehavior.msgOp = ((IMBehaviorMsgOP)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/IMBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */