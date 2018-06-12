package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import f.a.a.b;
import java.util.LinkedList;

public final class ax
  extends bhp
{
  public boolean jRm;
  public aj jRn;
  public String jRo;
  public f jRp;
  public ab jRq;
  public g jRr;
  public db jRs;
  
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
      paramVarArgs.av(2, this.jRm);
      if (this.jRn != null)
      {
        paramVarArgs.fV(3, this.jRn.boi());
        this.jRn.a(paramVarArgs);
      }
      if (this.jRo != null) {
        paramVarArgs.g(4, this.jRo);
      }
      if (this.jRp != null)
      {
        paramVarArgs.fV(5, this.jRp.boi());
        this.jRp.a(paramVarArgs);
      }
      if (this.jRq != null)
      {
        paramVarArgs.fV(6, this.jRq.boi());
        this.jRq.a(paramVarArgs);
      }
      if (this.jRr != null)
      {
        paramVarArgs.fV(7, this.jRr.boi());
        this.jRr.a(paramVarArgs);
      }
      if (this.jRs != null)
      {
        paramVarArgs.fV(8, this.jRs.boi());
        this.jRs.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1137;
      }
    }
    label1137:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 1);
      paramInt = i;
      if (this.jRn != null) {
        paramInt = i + f.a.a.a.fS(3, this.jRn.boi());
      }
      i = paramInt;
      if (this.jRo != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jRo);
      }
      paramInt = i;
      if (this.jRp != null) {
        paramInt = i + f.a.a.a.fS(5, this.jRp.boi());
      }
      i = paramInt;
      if (this.jRq != null) {
        i = paramInt + f.a.a.a.fS(6, this.jRq.boi());
      }
      paramInt = i;
      if (this.jRr != null) {
        paramInt = i + f.a.a.a.fS(7, this.jRr.boi());
      }
      i = paramInt;
      if (this.jRs != null) {
        i = paramInt + f.a.a.a.fS(8, this.jRs.boi());
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
        ax localax = (ax)paramVarArgs[1];
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
            localax.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localax.jRm = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localax.jRn = ((aj)localObject1);
            paramInt += 1;
          }
        case 4: 
          localax.jRo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new f();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((f)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localax.jRp = ((f)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ab();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ab)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localax.jRq = ((ab)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new g();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((g)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localax.jRr = ((g)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new db();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((db)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localax.jRs = ((db)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */