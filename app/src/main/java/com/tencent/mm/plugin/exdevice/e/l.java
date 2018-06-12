package com.tencent.mm.plugin.exdevice.e;

import java.util.LinkedList;

public final class l
  extends j
{
  public com.tencent.mm.bk.b hbs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ixj == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.ixj != null)
      {
        paramVarArgs.fV(1, this.ixj.boi());
        this.ixj.a(paramVarArgs);
      }
      if (this.hbs != null) {
        paramVarArgs.b(2, this.hbs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.ixj == null) {
        break label357;
      }
    }
    label357:
    for (paramInt = f.a.a.a.fS(1, this.ixj.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(2, this.hbs);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = j.a(paramVarArgs); paramInt > 0; paramInt = j.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ixj != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        l locall = (l)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, j.a((f.a.a.a.a)localObject2))) {}
            locall.ixj = ((e)localObject1);
            paramInt += 1;
          }
        }
        locall.hbs = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */