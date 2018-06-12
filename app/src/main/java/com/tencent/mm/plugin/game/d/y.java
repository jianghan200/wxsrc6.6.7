package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.fk;
import java.util.LinkedList;

public final class y
  extends bhd
{
  public String jPc;
  public String jQk;
  public com.tencent.mm.bk.b jQl;
  public com.tencent.mm.bk.b jQm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc == null) {
        throw new f.a.a.b("Not all required fields were included: AppID");
      }
      if (this.jQk == null) {
        throw new f.a.a.b("Not all required fields were included: GroupID");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jPc != null) {
        paramVarArgs.g(2, this.jPc);
      }
      if (this.jQk != null) {
        paramVarArgs.g(3, this.jQk);
      }
      if (this.jQl != null) {
        paramVarArgs.b(4, this.jQl);
      }
      if (this.jQm != null) {
        paramVarArgs.b(5, this.jQm);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label555;
      }
    }
    label555:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPc);
      }
      i = paramInt;
      if (this.jQk != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jQk);
      }
      paramInt = i;
      if (this.jQl != null) {
        paramInt = i + f.a.a.a.a(4, this.jQl);
      }
      i = paramInt;
      if (this.jQm != null) {
        i = paramInt + f.a.a.a.a(5, this.jQm);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jPc == null) {
          throw new f.a.a.b("Not all required fields were included: AppID");
        }
        if (this.jQk != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: GroupID");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localy.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localy.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localy.jQk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localy.jQl = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localy.jQm = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */