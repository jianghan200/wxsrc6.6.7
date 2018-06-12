package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class bq
  extends com.tencent.mm.bk.a
{
  public String desc;
  public LinkedList<by> hyy = new LinkedList();
  public String summary;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.summary != null) {
        paramVarArgs.g(1, this.summary);
      }
      if (this.desc != null) {
        paramVarArgs.g(2, this.desc);
      }
      paramVarArgs.d(3, 8, this.hyy);
      if (this.url != null) {
        paramVarArgs.g(4, this.url);
      }
      if (this.title != null) {
        paramVarArgs.g(5, this.title);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.summary == null) {
        break label477;
      }
    }
    label477:
    for (paramInt = f.a.a.b.b.a.h(1, this.summary) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.desc);
      }
      i += f.a.a.a.c(3, 8, this.hyy);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.url);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.title);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hyy.clear();
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
        bq localbq = (bq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbq.summary = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbq.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new by();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((by)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbq.hyy.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbq.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbq.title = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/d/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */