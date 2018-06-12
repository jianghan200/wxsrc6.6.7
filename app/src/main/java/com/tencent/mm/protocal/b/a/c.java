package com.tencent.mm.protocal.b.a;

import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wf;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bk.a
{
  public String desc;
  public LinkedList<vx> dzs = new LinkedList();
  public String qXZ;
  public wf qYa;
  public long qYb;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(2, this.desc);
      }
      paramVarArgs.d(3, 8, this.dzs);
      if (this.qXZ != null) {
        paramVarArgs.g(4, this.qXZ);
      }
      if (this.qYa != null)
      {
        paramVarArgs.fV(5, this.qYa.boi());
        this.qYa.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.qYb);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label610;
      }
    }
    label610:
    for (paramInt = f.a.a.b.b.a.h(1, this.title) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.desc);
      }
      i += f.a.a.a.c(3, 8, this.dzs);
      paramInt = i;
      if (this.qXZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qXZ);
      }
      i = paramInt;
      if (this.qYa != null) {
        i = paramInt + f.a.a.a.fS(5, this.qYa.boi());
      }
      return i + f.a.a.a.S(6, this.qYb);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.dzs.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        c localc = (c)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localc.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localc.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new vx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.dzs.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localc.qXZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.qYa = ((wf)localObject1);
            paramInt += 1;
          }
        }
        localc.qYb = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */