package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class alu
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rOh;
  public int rOi;
  public LinkedList<alw> rOj = new LinkedList();
  public LinkedList<Integer> rOk = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rOh == null) {
        throw new f.a.a.b("Not all required fields were included: RawBuf");
      }
      if (this.rOh != null) {
        paramVarArgs.b(1, this.rOh);
      }
      paramVarArgs.fT(2, this.rOi);
      paramVarArgs.d(3, 8, this.rOj);
      paramVarArgs.d(4, 2, this.rOk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rOh == null) {
        break label434;
      }
    }
    label434:
    for (paramInt = f.a.a.a.a(1, this.rOh) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rOi) + f.a.a.a.c(3, 8, this.rOj) + f.a.a.a.c(4, 2, this.rOk);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rOj.clear();
        this.rOk.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rOh != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: RawBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        alu localalu = (alu)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localalu.rOh = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 2: 
          localalu.rOi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((alw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localalu.rOj.add(localObject1);
            paramInt += 1;
          }
        }
        localalu.rOk.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/alu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */